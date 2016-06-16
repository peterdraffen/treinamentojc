package br.com.powerlogic.treinamento.app.model.repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import com.powerlogic.jcompany.core.model.repository.PlcAbstractRepository;
import com.powerlogic.jcompany.core.exception.PlcException;
import br.com.powerlogic.treinamento.app.model.repository.FuncionarioRepository;
import br.com.powerlogic.treinamento.app.entity.FuncionarioEntity;

/**
 * Repository for "Funcionario"
 *
 * @author jCompany Generator
 *
 */

@ApplicationScoped
public class FuncionarioRepository extends PlcAbstractRepository<Long, FuncionarioEntity> {

	@Override
	public Class<FuncionarioEntity> getEntityType() {
		return FuncionarioEntity.class;
	}

	@Override
	public List<FuncionarioEntity> findAll(FuncionarioEntity entity) throws PlcException {
		return super.find(entity);
	}

}
