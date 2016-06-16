(function() {
  'use strict';

  angular.module('treinamento-view').controller('FuncionarioController', FuncionarioController );

  /** @ngInject */
  function FuncionarioController($scope, $controller, FuncionarioService) {
    var vm = this;
		$scope.$baseService = FuncionarioService;
	    $scope.$baseRoute = 'funcionario';

		$scope.detalhes = [];
	  			  

 			      
	$scope.columnDefs = [
                         { field: 'id', displayName: 'label.funcionario.id', headerCellFilter:'translate', width: '10%'}
 		//,{ field: 'nome', displayName: 'Nome', headerCellFilter:'translate', width: '25%'}
        //,{ field: 'email', displayName: 'E-mail', headerCellFilter:'translate', width: '20%'}
        //,{ field: 'cpf', displayName: 'CPF', headerCellFilter:'translate', width: '15%'}
        //,{ field: 'dataNascimento', displayName: 'Nascimento', width: '10%', headerCellFilter:'translate', cellFilter: 'date:\'dd/MM/yyyy\''}
        //,{ field: 'departamento.descricao', displayName: 'Departamento', headerCellFilter:'translate', width: '20%'}
                ]

    angular.extend(vm, $controller('PlcBaseController', {$scope: $scope}));
  }
})();


