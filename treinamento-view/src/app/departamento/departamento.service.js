(function() {
  'use strict';

  angular
    .module('treinamento-view')
    .factory('DepartamentoService', DepartamentoService);

  /** @ngInject */
  function DepartamentoService(PlcEntityService, $class) {

  	var Service = $class.createClass(PlcEntityService, {
        constructor: function() {
            PlcEntityService.call(this, {
                 type: 'departamento'
            });
        }
	});
    return new Service();
  }

})();
