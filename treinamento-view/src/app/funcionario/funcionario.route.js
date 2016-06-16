
(function() {
	'use strict';

	angular
	.module('treinamento-view')
	.config(FuncionarioRouterConfig);


	function FuncionarioRouterConfig($stateProvider, $urlRouterProvider) {

		$stateProvider
		.state('funcionario', {
			abstract: true,
			url: '/funcionario',
			templateUrl: 'app/app.html'
		});

		$stateProvider
		.state('funcionario.sel', {
			url: '/funcionariosel',
			templateUrl: 'app/funcionario/funcionariosel.html'
		});

		$stateProvider
		.state('funcionario.man', {
			url: '/funcionarioman/:id',
			templateUrl: 'app/funcionario/funcionarioman.html'
		});
	}
	
})();


