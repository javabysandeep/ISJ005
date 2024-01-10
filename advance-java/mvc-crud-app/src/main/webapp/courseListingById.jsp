<%@ page import="com.itshaala.model.Course" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Course Listing</title>
</head>
<body>
<%
    Course course = (Course) request.getAttribute("course");
%>
<table border="10px solid">
    <tr style="border: 3px solid;">
        <th>Course ID</th>
        <th>Course Name</th>
        <th>Course Price</th>
    </tr>

    <tr>
        <td><%=course.getCourseId()%>
        </td>
        <td><%=course.getCourseName()%>
        </td>
        <td><%=course.getCoursePrice()%>
        </td>
    </tr>
</table>
</body>
</html>
