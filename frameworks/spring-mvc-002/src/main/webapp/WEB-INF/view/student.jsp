<%@ page import="java.time.LocalDateTime" %>
<%@ page import="com.itshaala.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Page</title>
</head>
<body>
Welcome user, <%=LocalDateTime.now()%>
<hr/>
<%
    List<Student> students = (List<Student>) request.getAttribute("students");
    PrintWriter writer = response.getWriter();
    for (Student student : students) {
        writer.println(student);
    }
%>

</body>
</html>
