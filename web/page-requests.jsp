<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>page-requests</title>
</head>
<body>
<form name="f1" method="get">
    <input style="color:gray;" type="text" name="input1" id="1" value="richest user">
    <input type="submit" name="button1" value="get"/><br>
    <input style="color:gray;" type="text" name="input2" id="2" value="accounts sum">
    <input type="submit" name="button2" value="get"/>
</form>

<%
    if (request.getParameter("button1") != null) {
        request.getRequestDispatcher("/forward-first.jsp").forward(request, response);
    }
    if (request.getParameter("button2") != null) {
        request.getRequestDispatcher("/forward-second.jsp").forward(request, response);
    }
%>

<br><a href="index.jsp">back to "Index page"</a>
</body>
</html>
