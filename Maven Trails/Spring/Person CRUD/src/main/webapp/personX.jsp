<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <html>

            <head>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            </head>

            <body>
                <div class="container well">
                    <form:form action="/add" method="post">
                        <div class="w3-third" style="margin:1%; width:40%">
                            <input type="text" name="name" class="form-control" placeholder="Person Name" autofocus required/>
                        </div>
                        <div class="w3-third" style="margin:1%; width:40%">
                            <input type="text" name="age" class="form-control" placeholder="Person Age" required/>
                        </div>
                        <div class="w3-third" style="margin:1%; width:5%">
                            <input type="submit" class="btn btn-primary btn-md" value="Add Person" />
                        </div>
                    </form:form>
                </div>

                <div class="container well">
                    <c:if test="${!empty list}">
                        <table>
                            <c:forEach items="${list}" var="x">
                                <div class="w3-third" style="margin:1%; width:40%">
                                    <p class="form-control">${x.name}</p>
                                </div>
                                <div class="w3-third" style="margin:1%; width:40%">
                                    <p class="form-control">${x.age}</p>
                                </div>
                                <div class="w3-third" style="margin:1%; width:5%">
                                    <input type="button" onclick="location.href='/delete/${x.id}';" value="Delete" class="btn btn-danger btn-md" />
                                </div>
                                <div class="w3-third" style="margin:1%; width:5%">
                                    <input type="button" onclick="location.href='/edit/${x.id}';" value="Edit" class="btn btn-warning btn-md" />
                                </div>
                            </c:forEach>
                        </table>
                    </c:if>
                    <c:if test="${empty list}">
                        <p style="text-align-last:center; color:grey">List Empty
                    </c:if>
                </div>
            </body>

            </html>