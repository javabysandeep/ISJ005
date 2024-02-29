<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Student Form</title>
</head>
<body>
<form action="http://localhost:8080/spring_mvc_ui_controller_war/student/create" method="post">
    <table>
        <tr>
            <td>Student Id</td>
            <td><input type="number" name="id"></td>
        </tr>
        <tr>
            <td>Student Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Student Email</td>
            <td><input type="email" name="email"></td>
        </tr>
        <tr>
            <td>Student Phone</td>
            <td><input type="number" name="phone"></td>
        </tr>
        <tr>
            <td>Student Address</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add Student"></td>
        </tr>
    </table>
</form>
</body>
</html>
