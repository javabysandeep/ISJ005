<html>
<head>
    <title>Scriptlet tags</title>
</head>
<body>
Scriptlet tag --> this will be part of service method
<br/>

<table border="10px solid">
    <tr>
        <th>Declaration Tag</th>
        <th>Scriptlet Tag</th>
        <th>Expression Tag</th>
    </tr>
    <tr>
        <td>
            <%! int a = 100;
                static int b = 1001;

                void m1() {
                    System.out.println("m1 method");
                } %>
        </td>
        <td>
            <%
                out.println("scriptlet tag");
                m1();
            %>
        </td>
        <td>
            <%=a + b%>
        </td>

        </td>
    </tr>

</table>

</body>
</html>
