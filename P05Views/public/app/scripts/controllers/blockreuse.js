'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('BlockReuseCtrl', function ($scope) {
    activeMenu('blockreuse');
    $scope.tema="Reuso de bloques de plantillas";

  });
