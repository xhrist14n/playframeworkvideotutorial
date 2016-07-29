'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('AtCtrl', function ($scope) {
    activeMenu('at');
    $scope.tema = "At en plantillas";
  });
