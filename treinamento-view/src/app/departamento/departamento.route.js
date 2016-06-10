
(function() {
	'use strict';

	angular
	.module('treinamento-view')
	.config(DepartamentoRouterConfig);


	function DepartamentoRouterConfig($stateProvider, $urlRouterProvider) {

		$stateProvider
		.state('departamento', {
			abstract: true,
			url: '/departamento',
			templateUrl: 'app/app.html'
		});

		$stateProvider
		.state('departamento.sel', {
			url: '/departamentosel',
			templateUrl: 'app/departamento/departamentosel.html'
		});

		$stateProvider
		.state('departamento.man', {
			url: '/departamentoman/:id',
			templateUrl: 'app/departamento/departamentoman.html'
		});
	}
	
})();


