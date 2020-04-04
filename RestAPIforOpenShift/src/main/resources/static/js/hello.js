angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://www.satendranegi.com/getsitestats').
        then(function(response) {
            $scope.greeting = response.data;
        });
});