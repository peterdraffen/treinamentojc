(function() {
  'use strict';

  angular
    .module('treinamento-view')
    .factory('CursoService', CursoService);

  /** @ngInject */
  function CursoService(PlcEntityService, $class) {

  	var Service = $class.createClass(PlcEntityService, {
        constructor: function() {
            PlcEntityService.call(this, {
                 type: 'curso'
            });
        }
	});
    return new Service();
  }

})();
