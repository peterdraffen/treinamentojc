package br.com.powerlogic.treinamento.app.model.repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import com.powerlogic.jcompany.core.model.repository.PlcAbstractRepository;
import com.powerlogic.jcompany.core.exception.PlcException;
import br.com.powerlogic.treinamento.app.model.repository.DepartamentoRepository;
import br.com.powerlogic.treinamento.app.entity.DepartamentoEntity;

/**
 * Repository for "Departamento"
 *
 * @author jCompany Generator
 *
 */

@ApplicationScoped
public class DepartamentoRepository extends PlcAbstractRepository<Long, DepartamentoEntity> {

	@Override
	public Class<DepartamentoEntity> getEntityType() {
		return DepartamentoEntity.class;
	}

	@Override
	public List<DepartamentoEntity> findAll(DepartamentoEntity entity) throws PlcException {
		return super.find(entity);
	}

}
