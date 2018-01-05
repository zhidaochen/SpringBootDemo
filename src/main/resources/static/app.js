var app = angular.module('demo', []);

app.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/TestCRUD/api/user').
        then(function(response) {
            $scope.user = response.data;
			
        });
});