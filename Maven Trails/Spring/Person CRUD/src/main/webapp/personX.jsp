<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <html>

            <head>
                <!-- Latest compiled and minified CSS -->
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

                <!-- jQuery library -->
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

                <!-- Latest compiled JavaScript -->
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            </head>

            <body>
                <form:form action="/add" method="post">
                    <table class="w3-table w3-bordered" style="width:100%">
                        <tr>
                            <td>
                                <input type="text" class="form-control" name="name" autofocus required/>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="age" required/>
                            </td>
                            <td>
                                <input type="submit" class="btn btn-primary" value="Add Person"/>
                            </td>
                        </tr>
                    </table>
                </form:form>
                <c:if test="${!empty list}">
                    <table class="w3-table w3-bordered" style="width:100%">
                        <c:forEach items="${list}" var="x">
                            <tr style="width:100%">
                                <td>${x.name}
                                </td>
                                <td>${x.age}
                                </td>
                                <td>
                                    <form:form action="/delete/${x.id}" method="delete">
                                        <input class="btn btn-danger" type="submit" value="DELETE" />
                                    </form:form>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </c:if>
            </body>

            </html>