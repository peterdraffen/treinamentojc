package br.com.powerlogic.treinamento.app.service;

import javax.ejb.Local;

import com.powerlogic.jcompany.core.model.service.IPlcEntityService;
import br.com.powerlogic.treinamento.app.entity.CursoEntity;

/**
 * EJB Service Interface for  "Curso"
 *
 * @author jCompany Generator
 *
 */

@Local
public interface ICursoService extends IPlcEntityService<Long, CursoEntity> {
   

}

