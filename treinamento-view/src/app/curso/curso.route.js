
(function() {
	'use strict';

	angular
	.module('treinamento-view')
	.config(CursoRouterConfig);


	function CursoRouterConfig($stateProvider, $urlRouterProvider) {

		$stateProvider
		.state('curso', {
			abstract: true,
			url: '/curso',
			templateUrl: 'app/app.html'
		});

		$stateProvider
		.state('curso.sel', {
			url: '/cursosel',
			templateUrl: 'app/curso/cursosel.html'
		});

		$stateProvider
		.state('curso.man', {
			url: '/cursoman/:id',
			templateUrl: 'app/curso/cursoman.html'
		});
	}
	
})();


