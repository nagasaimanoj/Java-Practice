<%@ page import="java.sql.*" %>
    <html>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <style>
        table {
            padding: 10px;
            border-spacing: 15px;
            border-style: solid;
            border-color: black;
        }

        h1 {
            font: bold;
            color: black;
        }

        body {
            background-color: darkgray;
        }
    </style>
    <script src="http://code.jquery.com/jquery-latest.js">

    </script>
    <script>
        $(document).ready(function () {
            $('#submit).click(function(event){
                    var username = $('#name').val();
            $.get('ActionServlet', { name: username }, function (responseText) {
                $('#welcometext').text(responseText);
            });
        });
        });
    </script>
    <script>
        function validate() {
            var email = document.myform.email.value;
            var atposition = email.indexOf("@");
            var dotposition = email.indexOf(".");
            if (atposition < 1 || dotposition < atposition + 5 || dotposition + 2 >= x.length) {
                alert("please enter valid email");
            }
            return false;
        }
    </script>

    <body>
        <br><br>
        <center>
            <h1>CONTESTANT INTIMATION</h1>
            <form name="myform" method="POST" action="/mainservlet" enctype="multipart/form-data">
                <table color="cornflowerblue">

                    <td> To :</td>
                    <td><input type="text" name="email"></td>
                    <tr>
                        </br>
                        <td>CC:</td>
                        <td><input type="text" name="cc"></td>
                    </tr>
                    <tr>
                        <td> FILENAME:<input type="text" name="filename"></td>
                        <td> UPLOAD FILE:<input type="file" name="content"></td>
                    </tr>
                    </br>
                </table>
                <br>
                <br>
                <center>
                    <input type="submit" name="submit" value="Submit"> &nbsp;&nbsp;&nbsp;&nbsp;
                    <div id="welcometext"></div>
                </center>
            </form>
    </body>

    </html>