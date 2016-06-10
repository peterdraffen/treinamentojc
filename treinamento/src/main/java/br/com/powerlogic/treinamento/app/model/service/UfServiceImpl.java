package br.com.powerlogic.treinamento.app.model.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.Valid;

import com.powerlogic.jcompany.core.exception.PlcException;
import com.powerlogic.jcompany.core.model.repository.IPlcEntityRepository;
import com.powerlogic.jcompany.core.model.service.PlcAbstractServiceEntity;

import br.com.powerlogic.treinamento.app.entity.UfEntity;
import br.com.powerlogic.treinamento.app.model.repository.UfRepository;
import br.com.powerlogic.treinamento.app.service.IUfService;

/**
 * EJB Service for "Uf"
 *
 * @author jCompany Generator
 *
 */

@Stateless
public class UfServiceImpl extends PlcAbstractServiceEntity<Long,  UfEntity> implements  IUfService {

	@Inject
	private UfRepository ufRepository;


	@Override
	protected IPlcEntityRepository<Long, UfEntity> getEntityRepository() {
		return ufRepository;
	}

	@Override
	public UfEntity save(@Valid UfEntity entity) throws PlcException {
		return super.save(entity);
	}

}


