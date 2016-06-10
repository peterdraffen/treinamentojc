package br.com.powerlogic.treinamento.app.model.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.Valid;

import com.powerlogic.jcompany.core.exception.PlcException;
import com.powerlogic.jcompany.core.model.repository.IPlcEntityRepository;
import com.powerlogic.jcompany.core.model.service.PlcAbstractServiceEntity;

import br.com.powerlogic.treinamento.app.entity.DepartamentoEntity;
import br.com.powerlogic.treinamento.app.model.repository.DepartamentoRepository;
import br.com.powerlogic.treinamento.app.service.IDepartamentoService;

/**
 * EJB Service for "Departamento"
 *
 * @author jCompany Generator
 *
 */

@Stateless
public class DepartamentoServiceImpl extends PlcAbstractServiceEntity<Long,  DepartamentoEntity> implements  IDepartamentoService {

	@Inject
	private DepartamentoRepository departamentoRepository;


	@Override
	protected IPlcEntityRepository<Long, DepartamentoEntity> getEntityRepository() {
		return departamentoRepository;
	}

	@Override
	public DepartamentoEntity save(@Valid DepartamentoEntity entity) throws PlcException {
		return super.save(entity);
	}

}


