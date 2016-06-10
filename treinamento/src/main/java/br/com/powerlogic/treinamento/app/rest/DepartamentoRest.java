package br.com.powerlogic.treinamento.app.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.powerlogic.jcompany.core.rest.auth.PlcAuthenticated;
import com.powerlogic.jcompany.core.rest.entity.PlcAbstractEntityRest;
import com.powerlogic.jcompany.core.rest.messages.PlcMessageIntercept;

import br.com.powerlogic.treinamento.app.entity.DepartamentoEntity;
import br.com.powerlogic.treinamento.app.service.IDepartamentoService;

/**
 * Rest controller for  "Departamento"
 *
 * @author jCompany Generator
 *
 */

@PlcAuthenticated
@Path("/entity/departamento")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@PlcMessageIntercept
public class DepartamentoRest extends PlcAbstractEntityRest<Long, DepartamentoEntity, Object> {

   @Inject
   private IDepartamentoService departamentoService;

   @Override
   protected IDepartamentoService getEntityService() {
      return departamentoService;
   }

}
