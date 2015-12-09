package com.jerseydemo.core.utilities;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class ConfigLocationHelper
 {
	private static final String WEB_CONFIG_ROOT_NAME = "/WEB-INF";

	private static final String WEB_CONFIG_ROOT_NAME_WITH_CLASSPATH = WEB_CONFIG_ROOT_NAME + "/classes";

	public static final String CONFIG_ROOT_NAME = "/config";

	/**
	 * getClassPath
	 */
	public static String getClassPath(String name) {
		try {
			return URLDecoder.decode(ConfigLocationHelper.class.getClassLoader().getResource(name).getPath(),
					Charset.defaultCharset().toString());
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * getWebApplicationConfigPath
	 */
	public static String getWebApplicationConfigPath(String webdir) {
		String classPath = getClassPath(webdir);
		return StringUtils.substringBefore(classPath, WEB_CONFIG_ROOT_NAME) + WEB_CONFIG_ROOT_NAME;
	}

	/**
	 * getConfigPath
	 */
	public static String getConfigPath(String webdir) {
		return getWebApplicationConfigPath(webdir) + CONFIG_ROOT_NAME;
	}

	/**
	 * getFullPathOfConfigLocationArray
	 */
	public static String[] getFullPathOfConfigLocationArray(String cfgFileName) {
		return getConfigLocationArrayWithSamePrefix(cfgFileName, getWebApplicationConfigPath(""));
	}

	public static String[] getFullPathOfConfigLocationArray(String cfgFileName, String parent) {
		return getConfigLocationArrayWithSamePrefix(cfgFileName, parent);
	}

	/**
	 * getConfigLocationArray
	 */
	public static String[] getConfigLocationArray(String cfgFileName) {
		return getConfigLocationArray(cfgFileName, null, null);
	}

	public static String[] getConfigLocationArray(String cfgFileName, String parent) {
		return getConfigLocationArray(cfgFileName, parent, null);
	}

	public static String[] getConfigLocationArray(String cfgFileName, String parent, String prefix) {
		prefix = StringUtils.defaultIfEmpty(prefix, "");
		prefix = StringUtils.removeEnd(prefix, WEB_CONFIG_ROOT_NAME);
		if (StringUtils.isEmpty(parent) || StringUtils.isBlank(parent))
			parent = getWebApplicationConfigPath("");

		parent = StringUtils.replaceChars(parent, '\\', '/');
		parent = StringUtils.removeEnd(parent, "/");

		if (StringUtils.endsWith(parent, WEB_CONFIG_ROOT_NAME))
			parent = StringUtils.removeEnd(parent, WEB_CONFIG_ROOT_NAME);
		else if (StringUtils.endsWith(parent, WEB_CONFIG_ROOT_NAME_WITH_CLASSPATH))
			parent = StringUtils.removeEnd(parent, WEB_CONFIG_ROOT_NAME_WITH_CLASSPATH);

		Set<String> files = new HashSet<String>();
		File root = new File(parent);
		getConfigLocations(root, "", cfgFileName, prefix, files);

		return files.toArray(new String[0]);
	}

	/**
	 * getConfigLocationArrayWithSamePrefix
	 */
	public static String[] getConfigLocationArrayWithSamePrefix(String cfgFileName, String parent) {
		return getConfigLocationArray(cfgFileName, parent, parent);
	}

	private static void getConfigLocations(File rootDir, String currentPath, String cfgFileName, String prefix,
			Set<String> files) {
		String[] fileNames = rootDir.list();
		if (fileNames == null)
			return;
		String filePath = rootDir.getPath();
		for (int i = 0; i < fileNames.length; i++) {
			if (fileNames[i].equals(".") || fileNames[i].equals(".."))
				continue;
			if (fileNames[i].startsWith(cfgFileName) && fileNames[i].endsWith(".xml")) {
				files.add(StringUtils.replaceChars(prefix + currentPath + File.separator + fileNames[i], '\\', '/'));
				continue;
			}
			File file = new File(filePath + File.separator + fileNames[i]);
			if (file.isDirectory()) {
				getConfigLocations(file, currentPath + File.separator + fileNames[i], cfgFileName, prefix, files);
			}
		}
	}
}
