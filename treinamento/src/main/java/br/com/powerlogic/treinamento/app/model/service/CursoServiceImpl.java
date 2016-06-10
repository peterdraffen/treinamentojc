package br.com.powerlogic.treinamento.app.model.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.Valid;

import com.powerlogic.jcompany.core.exception.PlcException;
import com.powerlogic.jcompany.core.model.repository.IPlcEntityRepository;
import com.powerlogic.jcompany.core.model.service.PlcAbstractServiceEntity;

import br.com.powerlogic.treinamento.app.entity.CursoEntity;
import br.com.powerlogic.treinamento.app.model.repository.CursoRepository;
import br.com.powerlogic.treinamento.app.service.ICursoService;

/**
 * EJB Service for "Curso"
 *
 * @author jCompany Generator
 *
 */

@Stateless
public class CursoServiceImpl extends PlcAbstractServiceEntity<Long,  CursoEntity> implements  ICursoService {

	@Inject
	private CursoRepository cursoRepository;

	@Override
	public List<CursoEntity> findAll(CursoEntity entity) throws PlcException {
		System.out.println("5) PASSOU SERVICE.FINDALL " + entity.toString());
		return super.findAll(entity);
	}

	@Override
	public CursoEntity get(Long id) {
		System.out.println("11) PASSOU SERVICE.GET " + id);
		return super.get(id);
	}

	@Override
	protected IPlcEntityRepository<Long, CursoEntity> getEntityRepository() {
		return cursoRepository;
	}

	@Override
	public CursoEntity save(@Valid CursoEntity entity) throws PlcException {
		System.out.println("2) PASSOU SERVICE " + entity.toString());
		return super.save(entity);
	}

}


