'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('CharacterCtrl', function ($scope) {
    activeMenu('character');

    $scope.tema = 'Escape de caracteres';

  });
