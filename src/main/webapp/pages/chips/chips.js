Application.$controller("chipsPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
    };


    $scope.button1Click = function($event, $isolateScope) {
        debugger;
        $scope.Widgets.chips3_1.dataset = $scope.Variables.HrdbEmployeeData.dataSet;
        /*    $scope.Widgets.chips3_1.datafield = $scope.Variables.HrdbEmployeeData.dataSet.firstname;
            $scope.Widgets.chips3_1.displayfield = $scope.Variables.HrdbEmployeeData.dataSet.firstname;*/
    };

}]);

Application.$controller("RepsTable1Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);