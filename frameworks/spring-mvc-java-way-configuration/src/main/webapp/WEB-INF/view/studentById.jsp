<%@ page import="java.time.LocalDateTime" %>
<%@ page import="com.itshaala.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student By Id</title>
</head>
<body>
Welcome user, <%=LocalDateTime.now()%>
<hr/>
<%
    Student student = (Student) request.getAttribute("studentById");
    PrintWriter writer = response.getWriter();
    writer.println(student);

%>

</body>
</html>
