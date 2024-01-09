<%@ page import="java.io.PrintWriter" errorPage="exceptionHandler.jsp" %>
<html>
<head>
    <title>expression tag</title>
</head>
<body>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operation = request.getParameter("operation");
    PrintWriter ref = response.getWriter();
    switch (operation) {
        case "+" : ref.println("Addition is " + (number1 + number2));break;
        case "-" : ref.println("Subtraction is " + (number1 - number2));break;
        case "*" : ref.println("Multiplication is " + (number1 * number2));break;
        case "/" : ref.println("Division - Quotient is " + (number1 / number2));break;
        case "%" : ref.println("Division - Remainder is  " + (number1 % number2));break;
        default : ref.println("Invalid Operator");break;
    }
%>
</body>
</html>
