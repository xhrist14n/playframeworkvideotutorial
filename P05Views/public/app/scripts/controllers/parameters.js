'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('ParametersCtrl', function ($scope) {
    activeMenu('parameters');
    $scope.tema = "Parametros de Twirl";

  });
