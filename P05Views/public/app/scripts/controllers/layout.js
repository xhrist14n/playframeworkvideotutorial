'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('LayoutCtrl', function ($scope) {
    activeMenu('layout');
    $scope.tema = 'Layout de Plantillas';
  });
