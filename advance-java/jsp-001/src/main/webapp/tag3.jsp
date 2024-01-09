<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <title>expression tag</title>
</head>
<body>
<%!
    int instanceVariable = 100;
    static int staticVariable = 99;

    void instanceMethod() {
        System.out.println("instance method");
    }

    static void staticMethod() {
        System.out.println("static method");
    }
%>

<%="Expression tag : instance variable = " + instanceVariable%>
<%="Expression tag : static variable = " + staticVariable%>
<%
    instanceMethod();
    staticMethod();
%>
<hr/>
</body>
</html>
