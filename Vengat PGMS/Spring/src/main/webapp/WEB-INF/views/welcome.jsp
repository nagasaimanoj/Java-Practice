<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>

    <head>
        <title>Welcome page</title>
    </head>

    <body>
        <h3> ${name} = Register successfully>>></h3>
    </body>
    <table>
        <tr>
            <th> ID </th>
            <th> Name</th>
            <th> Phno </th>
        </tr>
        <c:forEach items="${show_data}" var="datalist">
            <tr>
                <td>${datalist.id}</td>
                <td>${datalist.name}</td>
                <td>${datalist.phno}</td>
            </tr>
        </c:forEach>
    </table>

    </html>