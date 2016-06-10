package br.com.powerlogic.treinamento.app.model.repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import com.powerlogic.jcompany.core.model.repository.PlcAbstractRepository;
import com.powerlogic.jcompany.core.exception.PlcException;
import br.com.powerlogic.treinamento.app.model.repository.CursoRepository;
import br.com.powerlogic.treinamento.app.entity.CursoEntity;

/**
 * Repository for "Curso"
 *
 * @author jCompany Generator
 *
 */

@ApplicationScoped
public class CursoRepository extends PlcAbstractRepository<Long, CursoEntity> {

	@Override
	public Class<CursoEntity> getEntityType() {
		return CursoEntity.class;
	}

	@Override
	public List<CursoEntity> findAll(CursoEntity entity) throws PlcException {
		System.out.println("3) PASSOU REPOSITORIO " + entity.toString());
		return super.find(entity);
	}

}
