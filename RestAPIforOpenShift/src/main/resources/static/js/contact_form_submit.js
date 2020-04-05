app.controller('contact', function ($scope, $rootScope, $http) {
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