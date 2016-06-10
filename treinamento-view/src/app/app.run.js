(function() {
	'use strict';

	angular
	.module('treinamento-view')
	.run(AppRun);

	function AppRun(PlcAuthService) {  
		//aplica segurança
		PlcAuthService.load();
	}

})();
