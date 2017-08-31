<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>

    <head>
        <title>User Home Page</title>
    </head>

    <body>
        <h2>
            <%=request.getParameter("name")%>
        </h2>
        <h3>Name ${name}</h3>
        <h3>Phno ${phone}</h3>
    </body>

    </html>