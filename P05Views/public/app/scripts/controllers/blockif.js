'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('BlockIfCtrl', function ($scope) {
    activeMenu('blockif');

    $scope.tema='Bloque if en Plantillas';

  });
