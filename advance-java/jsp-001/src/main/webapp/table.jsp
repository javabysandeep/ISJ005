<html>
<head>
    <title>table printing logic</title>
</head>
<body>
<table border="10 px solid">
    <%
        for (int row = 1; row <= 10; row++) {

    %>
    <tr>
        <%
            for (int column = 1; column <= 30; column++) {
        %>
        <td><%=row * column%>
        </td>
        <% }%>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
