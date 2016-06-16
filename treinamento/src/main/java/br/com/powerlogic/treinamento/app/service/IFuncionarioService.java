package br.com.powerlogic.treinamento.app.service;

import javax.ejb.Local;

import com.powerlogic.jcompany.core.model.service.IPlcEntityService;
import br.com.powerlogic.treinamento.app.entity.FuncionarioEntity;

/**
 * EJB Service Interface for  "Funcionario"
 *
 * @author jCompany Generator
 *
 */

@Local
public interface IFuncionarioService extends IPlcEntityService<Long, FuncionarioEntity> {
   

}

