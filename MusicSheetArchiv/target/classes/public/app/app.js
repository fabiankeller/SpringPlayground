angular.module('musicsheetsApp', [])
    .controller('musicsheetsCtrl', function($scope, $http){
        $scope.musicsheets = [];

        $scope.findMusicSheets = function () {
            $http.get("/musicsheets").success(function (data) {
                $scope.musicsheets = data;
            })
        };

        $scope.findMusicSheets();

    });