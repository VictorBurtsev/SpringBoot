var app = angular.module("springDemo", []);

app.controller("AppCtrl", function ($scope, $http) {
    $scope.websites = [];
    $http.get('http://localhost:8081/api/ntc-4').success(function (data) {
        $scope.websites = data;
    });
});

var app = angular.module("springDemoAPI", []);

app.controller("AppCtrl", function ($scope, $http) {
    $scope.websites = [];
    $http.get('http://localhost:8081/api/stackoverflow').success(function (data) {
        $scope.websites = data;
    });
});
