angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://www.satendranegi.com/getsitestats').
        then(function(response) {
            $scope.greeting = response.data;
        });
});
.controller('contact', function ($scope, $rootScope, $http) {
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