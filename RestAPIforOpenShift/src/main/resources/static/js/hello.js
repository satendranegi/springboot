var app = angular.module('demo', [])
app.controller('Hello', function($scope, $http) {
    $http.get('http://www.satendranegi.com/getsitestats').
        then(function(response) {
            $scope.greeting = response.data;
        });
});

app.controller('Contact', function ($scope, $rootScope, $http) {
	console.log("inside contact for js");
	 $scope.form = {
             fullName : "",
             emailId : "",
             mobileNumber : "",
             message : ""
         };
	 
    $scope.contact = function () {
    	console.log("inside the function...data"+$scope.form.fullName)
    	$http({
            method : "POST",
            url : "http://localhost:8080/contact",
            data : angular.toJson($scope.form),
            headers : {
                'Content-Type' : 'application/json'
            }
        }).then(
        		function successCallback(response) {
        	        console.log("Successfully POST-ed data");
        		, function errorCallback(response) {
        	        console.log("POST-ing of data failed");
        	      } );
      }    
    
});