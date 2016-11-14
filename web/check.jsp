<%--
  Created by IntelliJ IDEA.
  User: Leo
  Date: 2016/11/14
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>身份证信息</title>
</head>
<body>
<%   String strName= (String) request.getAttribute("name");
%>
<h1>身份证信息</h1>

<p>
    姓名：<%=strName%>
</p>
</table>
</body>
</html>
