<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <title>scriptlet tag</title>
</head>
<body>
<%
    int localVariable = 100;
    System.out.println("printing at server side " + localVariable);
    PrintWriter writer = response.getWriter();
    writer.println("printing at client side " + localVariable);
%>
</body>
</html>
