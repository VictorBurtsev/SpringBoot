var app = angular.module("springDemo", []);

app.controller("AppCtrl", function ($scope, $http) {
    /*$scope.websites = [{
     iconImageUrl: 'http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico',
     id: '2',
     website: '3',
     title: '4',
     description: '5'
     }];*/

    $scope.websites = [];
    $http.get('http://localhost:8081/api/ntc-4').success(function (data) {
        $scope.websites = data;
    });
});
