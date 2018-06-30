<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="s" uri="/struts-tags"%> 
       <%@ taglib prefix="sx" uri="/struts-dojo-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<s:form action="login" method="post">
<s:textfield name="loginUser.account" label="输入账号"/>
<s:password name="loginUser.password" label="输入密码" />
<s:submit value="登录"/>
<s:reset value="重置"/>
</s:form>
</div>
</body>
</html>