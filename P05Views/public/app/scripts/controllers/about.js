'use strict';

/**
 * @ngdoc function
 * @name adminApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the adminApp
 */
angular.module('adminApp')
  .controller('AboutCtrl', function ($scope) {
    activeMenu('about');

    $scope.autor={
        'nombres':'Christian',
        'apellidos':'Portilla Pauca',
        'email':'xhrist14n@gmail.com',
        'web':'http://www.christianportilla.com',
        'blog':'http://javascriptx.wordpress.com'
    };
    $scope.curso='Play Framework';
    $scope.tema='Play Framework Vistas y Twirl';
  });
