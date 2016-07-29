'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('CommentsCtrl', function ($scope) {
    activeMenu('comments');
    $scope.tema='Comentarios en plantillas de Play Framework';
  });
