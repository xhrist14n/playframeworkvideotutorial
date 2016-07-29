'use strict';

/**
 * @ngdoc overview
 * @name adminApp
 * @description
 * # adminApp
 *
 * Main module of the application.
 */

angular
  .module('adminApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: '/views/main.html',
        controller: 'MainCtrl'
      })
      .when('/about', {
        templateUrl: '/views/about.html',
        controller: 'AboutCtrl'
      })
      .when('/at', {
        templateUrl: '/views/at.html',
        controller: 'AtCtrl'
      })
      .when('/blockif', {
        templateUrl: '/views/blockif.html',
        controller: 'BlockIfCtrl'
      })
      .when('/blockreuse', {
        templateUrl: '/views/blockreuse.html',
        controller: 'BlockReuseCtrl'
      })
      .when('/character', {
        templateUrl: '/views/character.html',
        controller: 'CharacterCtrl'
      })
      .when('/comments', {
        templateUrl: '/views/comments.html',
        controller: 'CommentsCtrl'
      })
      .when('/expression', {
        templateUrl: '/views/expression.html',
        controller: 'ExpressionCtrl'
      })
      .when('/includes', {
        templateUrl: '/views/includes.html',
        controller: 'IncludesCtrl'
      })
      .when('/iteration', {
        templateUrl: '/views/iteration.html',
        controller: 'IterationCtrl'
      })
      .when('/layout', {
        templateUrl: '/views/layout.html',
        controller: 'LayoutCtrl'
      })
      .when('/main', {
        templateUrl: '/views/main.html',
        controller: 'MainCtrl'
      })
      .when('/parameters', {
        templateUrl: '/views/parameters.html',
        controller: 'ParametersCtrl'
      })
      .when('/tags', {
        templateUrl: '/views/tags.html',
        controller: 'TagsCtrl'
      })
      .when('/usecase', {
        templateUrl: '/views/usecase.html',
        controller: 'UseCaseCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
