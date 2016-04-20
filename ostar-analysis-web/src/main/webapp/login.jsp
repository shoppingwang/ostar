<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Ostar-Analysis-用户登陆</title>
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body style="margin-top:50px;overflow: hidden;">
<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="hidden" name="id" value="${country.id}"/>
    <table class="gridtable" style="width:800px;">
        <tr>
            <th colspan="5">Ostar-用户登陆</th>
        </tr>
        <tr>
            <th>用户名：</th>
            <td><input type='text' name='username' value=''></td>
            <th>密码：</th>
            <td><input type='password' name='password'/></td>
            <sec:csrfInput/>
            <td><input type="submit" value="登陆"/></td>
        </tr>
        <sec:csrfInput/>
    </table>
</form>
</body>
</html>
