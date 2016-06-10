(function() {
  'use strict';

  angular.module('treinamento-view').controller('DepartamentoController', DepartamentoController );

  /** @ngInject */
  function DepartamentoController($scope, $controller, DepartamentoService) {
    var vm = this;
		$scope.$baseService = DepartamentoService;
	    $scope.$baseRoute = 'departamento';

		$scope.detalhes = [];
	  			  

 			      
	$scope.columnDefs = [
                         { field: 'id', displayName: 'label.departamento.id', headerCellFilter:'translate', width: '10%'}
 		//,{ field: 'nome', displayName: 'Nome', headerCellFilter:'translate', width: '25%'}
        //,{ field: 'email', displayName: 'E-mail', headerCellFilter:'translate', width: '20%'}
        //,{ field: 'cpf', displayName: 'CPF', headerCellFilter:'translate', width: '15%'}
        //,{ field: 'dataNascimento', displayName: 'Nascimento', width: '10%', headerCellFilter:'translate', cellFilter: 'date:\'dd/MM/yyyy\''}
        //,{ field: 'departamento.descricao', displayName: 'Departamento', headerCellFilter:'translate', width: '20%'}
                ]

    angular.extend(vm, $controller('PlcBaseController', {$scope: $scope}));
  }
})();


