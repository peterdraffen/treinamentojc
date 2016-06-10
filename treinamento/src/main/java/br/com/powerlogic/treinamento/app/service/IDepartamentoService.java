package br.com.powerlogic.treinamento.app.service;

import javax.ejb.Local;

import com.powerlogic.jcompany.core.model.service.IPlcEntityService;
import br.com.powerlogic.treinamento.app.entity.DepartamentoEntity;

/**
 * EJB Service Interface for  "Departamento"
 *
 * @author jCompany Generator
 *
 */

@Local
public interface IDepartamentoService extends IPlcEntityService<Long, DepartamentoEntity> {
   

}

