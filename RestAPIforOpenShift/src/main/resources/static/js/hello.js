var app = angular.module('demo', [])
app.controller('Hello', function($scope, $http) {
    $http.get('/getsitestats').
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
            url : "/contact",
            data : angular.toJson($scope.form),
            headers : {
                'Content-Type' : 'application/json'
            }
        }).then(function(response){
        	$scope.postresponse=response.data;
        	console.log("response from post..."+$scope.postresponse)
        });
      }    
    
});