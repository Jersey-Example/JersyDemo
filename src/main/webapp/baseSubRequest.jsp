<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>baseSubRequest</title>
<script language="JavaScript">
	function submitform() {
		form1.submit();
	}
</script>
</head>
<body>
	<form name="form1" action="/jerseydemo/testService/testRequest" method="post">
		<input type="hidden" name="reqType" value="baseSubRequest"> <br>
		<div class="divScrolling" id="content">
			<table width="80%" border="0" cellspacing="0" cellpadding="0" id="tab" class="tableborder" style="height: 241px">
				<tr>
					<td width="30%">&nbsp;<span class="STYLE1">*</span>手机号:
					</td>
					<td><input type="text" id="inMobileNo" name="mobileNo" value="13810491234" /></td>
				</tr>
				<tr>
					<td width="30%">&nbsp;<span class="STYLE1">*</span>请求来源(输入数字):
					</td>
					<td><input type="text" id="inReqSource" name="reqSource" value="1" /></td>
				</tr>
				<tr>
					<td width="30%">&nbsp;<span class="STYLE1">*</span>用户请求时间(格式yyyyMMddHHmmss):
					</td>
					<td><input type="text" id="inDate" name="reqTime" value="20101210153010" width="80%"></td>
				</tr>

				<tr>
					<td width="30%">&nbsp;<span class="STYLE1">*</span>是否批量:
					</td>
					<td><select id="select" name="isBatch">
							<option value="0">单个</option>
							<option value="1">批量</option>
					</select></td>
				</tr>
				<tr>
					<td width="30%">&nbsp;<span class="STYLE1">*</span>是否需要下发短信:
					</td>
					<td><select id="select" name="isMessage">
							<option value="0">不需要</option>
							<option value="1">需要</option>
					</select></td>
				</tr>
				<tr>
					<td width="20%">&nbsp;<span class="STYLE1">*</span>动作原因:
					</td>
					<td><select id="select" name="actionReason">
							<option value="1">用户主动发起</option>
							<option value="2">CM用户解除绑定</option>
					</select></td>
				</tr>
				<tr>
					<td>&nbsp;&nbsp;扩展字段:</td>
					<td><input type="text" name="ext" value="" onKeyDown="nextFocus()"></td>
				</tr>
				<tr height=60>
					<td colspan="2" align="center" style="height: 98px"><input type="button" name="subscribe" value="test" onClick="javascript:form1.submit();" /></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>