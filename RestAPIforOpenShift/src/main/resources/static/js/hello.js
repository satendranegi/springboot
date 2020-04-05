var app = angular.module('demo', [])
app.controller('Hello', function($scope, $http) {
    $http.get('http://www.satendranegi.com/getsitestats').
        then(function(response) {
            $scope.greeting = response.data;
        });
});

app.controller('Contact', function ($scope, $rootScope, $http) {
	console.log("inside contact for js");
    $scope.formData = {};
    $scope.contact = function () {
        $http.post('/contact', $scope.formData).then(
            function (resposne) {
                console.log("registered");
                console.log(response);
            },
            function (response) {
                console.log("Register error")
            }
        )
      }
});