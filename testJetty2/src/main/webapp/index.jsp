<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import ="java.net.*" %>
<%@ page import ="java.util.Date" %>
<html>

<head>

</head>
<body>

<%
InetAddress localHost = InetAddress.getLocalHost();
Date localTime = new Date();
%>
<H1>Who Am I?</H1>
I am called <%= localHost.getHostName() %> (<%= localHost.getHostAddress() %>).<br>
This page last executed at <%= localTime.toString() %>.

</br>

<h1>Hello ${text}</h1>

<h2>Method GET</h2>
    <form action="">
        name <input method="GET" name="name" type="text">

        </br>
        surname <input name="surname" type="text">
        </br>
        <input type="submit" value="send">
    </form>
<h2>Method POST</h2>
    <form action="">
        name <input method="POST" name="name" type="text">

        </br>
        surname <input name="surname" type="text">
        </br>
        <input type="submit" value="send">
    </form>

<h2>Результат:</h2>

<%=request.getAttribute("result")%>

</body>
</html>
