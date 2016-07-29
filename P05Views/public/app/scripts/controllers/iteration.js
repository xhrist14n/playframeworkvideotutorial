'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('IterationCtrl', function ($scope) {
    activeMenu('iteration');
    $scope.tema = 'Iteracion de elementos en Twirl ';
  });
