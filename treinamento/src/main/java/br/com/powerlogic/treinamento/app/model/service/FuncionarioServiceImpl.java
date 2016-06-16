package br.com.powerlogic.treinamento.app.model.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.interceptor.Interceptors;

import com.powerlogic.jcompany.core.model.repository.IPlcEntityRepository;
import com.powerlogic.jcompany.core.exception.PlcException;
import com.powerlogic.jcompany.core.model.service.PlcAbstractServiceEntity;
import br.com.powerlogic.treinamento.app.model.repository.FuncionarioRepository;
import br.com.powerlogic.treinamento.app.service.IFuncionarioService;
import br.com.powerlogic.treinamento.app.entity.FuncionarioEntity;

/**
 * EJB Service for "Funcionario"
 *
 * @author jCompany Generator
 *
 */

@Stateless
public class FuncionarioServiceImpl extends PlcAbstractServiceEntity<Long,  FuncionarioEntity> implements  IFuncionarioService {

	@Inject
	private FuncionarioRepository funcionarioRepository;


	@Override
	protected IPlcEntityRepository<Long, FuncionarioEntity> getEntityRepository() {
		return funcionarioRepository;
	}

	@Override
	public FuncionarioEntity save(@Valid FuncionarioEntity entity) throws PlcException {
		return super.save(entity);
	}

}


