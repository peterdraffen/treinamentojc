(function() {
  'use strict';

  angular
    .module('treinamento-view')
    .factory('FuncionarioService', FuncionarioService);

  /** @ngInject */
  function FuncionarioService(PlcEntityService, $class) {

  	var Service = $class.createClass(PlcEntityService, {
        constructor: function() {
            PlcEntityService.call(this, {
                 type: 'funcionario'
            });
        }
	});
    return new Service();
  }

})();
