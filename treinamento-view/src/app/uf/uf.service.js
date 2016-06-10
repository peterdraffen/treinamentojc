(function() {
  'use strict';

  angular
    .module('treinamento-view')
    .factory('UfService', UfService);

  /** @ngInject */
  function UfService(PlcEntityService, $class) {

  	var Service = $class.createClass(PlcEntityService, {
        constructor: function() {
            PlcEntityService.call(this, {
                 type: 'uf'
            });
        }
    });
    return new Service();
  }
  
})();
