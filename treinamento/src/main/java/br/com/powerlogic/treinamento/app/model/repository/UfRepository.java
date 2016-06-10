package br.com.powerlogic.treinamento.app.model.repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import com.powerlogic.jcompany.core.model.repository.PlcAbstractRepository;
import com.powerlogic.jcompany.core.exception.PlcException;
import br.com.powerlogic.treinamento.app.model.repository.UfRepository;
import br.com.powerlogic.treinamento.app.entity.UfEntity;

/**
 * Repository for "Uf"
 *
 * @author jCompany Generator
 *
 */

@ApplicationScoped
public class UfRepository extends PlcAbstractRepository<Long, UfEntity> {

	@Override
	public Class<UfEntity> getEntityType() {
		return UfEntity.class;
	}

	@Override
	public List<UfEntity> findAll(UfEntity entity) throws PlcException {
		return super.find(entity);
	}

}
