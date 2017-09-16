<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <html>

            <head>
                <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
            </head>

            <body>
                <form action="/add" method="post">
                    <table class="w3-table w3-bordered">
                        <tr>
                            <td>
                                <input type="text" name="name" style="width:100%" autofocus/>
                            </td>
                            <td>
                                <input type="text" name="age" style="width:100%" />
                            </td>
                            <td>
                                <input type="submit" value="Add Person" style="width:100%" />
                            </td>
                        </tr>
                    </table>
                </form>
                <c:if test="${!empty list}">
                    <table class="w3-table w3-bordered">
                        <c:forEach items="${list}" var="x">
                            <tr>
                                <td>${x.name}
                                </td>
                                <td>${x.age}
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </c:if>

            </body>

            </html>