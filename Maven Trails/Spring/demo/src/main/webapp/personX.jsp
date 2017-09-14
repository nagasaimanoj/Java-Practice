<html>

<head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script>
        var app = angular.module('myApp', []);
        app.controller('customersCtrl', function ($scope, $http) {
            $http.get("http://localhost:8080/").then(function (response) {
                $scope.names = response.data;
                console.log(response.data)
            });
        });
    </script>
</head>

<body>
    <h1>hello world</h1>

    <div ng-app="myApp" ng-controller="customersCtrl">
        <table>
            <tr ng-repeat="x in names">
                <td>{{ x.name }}</td>
                <td>{{ x.age }}</td>
            </tr>
        </table>

    </div>
</body>

</html>