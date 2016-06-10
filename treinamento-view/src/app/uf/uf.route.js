
(function() {
	'use strict';

	angular
	.module('treinamento-view')
	.config(UfRouterConfig);


	function UfRouterConfig($stateProvider, $urlRouterProvider) {

		$stateProvider
		.state('uf', {
			abstract: true,
			url: '/uf',
			templateUrl: 'app/app.html'
		});

		$stateProvider
		.state('uf.tab', {
			url: '/uf',
			templateUrl: 'app/uf/uf.html'
		});
	}
	
})();


