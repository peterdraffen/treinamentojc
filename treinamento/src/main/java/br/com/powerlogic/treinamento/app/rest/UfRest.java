package br.com.powerlogic.treinamento.app.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.powerlogic.jcompany.core.rest.auth.PlcAuthenticated;
import com.powerlogic.jcompany.core.rest.entity.PlcAbstractEntityRest;
import com.powerlogic.jcompany.core.rest.messages.PlcMessageIntercept;

import br.com.powerlogic.treinamento.app.entity.UfEntity;
import br.com.powerlogic.treinamento.app.service.IUfService;

/**
 * Rest controller for  "Uf"
 *
 * @author jCompany Generator
 *
 */

@PlcAuthenticated
@Path("/entity/uf")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@PlcMessageIntercept
public class UfRest extends PlcAbstractEntityRest<Long, UfEntity, Object> {

   @Inject
   private IUfService ufService;

   @Override
   protected IUfService getEntityService() {
      return ufService;
   }

}
