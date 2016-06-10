	(function() {
		'use strict';

		angular
		.module('treinamento-view')
		.config(AppConfig);

		function AppConfig(PlcMenuLoaderProvider) {

			PlcMenuLoaderProvider.addMenuPath('app/components/json/menu.json');

		}

	})();
