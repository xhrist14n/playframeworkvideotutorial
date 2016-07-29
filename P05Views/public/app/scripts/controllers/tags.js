'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('TagsCtrl', function ($scope) {
    activeMenu('tags');
    $scope.tema = 'Tags de Twirl';
  });
