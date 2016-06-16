package br.com.powerlogic.treinamento.app.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.servlet.http.HttpServletRequest;

import com.powerlogic.jcompany.core.exception.PlcException;
import com.powerlogic.jcompany.core.rest.auth.PlcAuthenticated;
import com.powerlogic.jcompany.core.rest.entity.PlcAbstractEntityRest;
import com.powerlogic.jcompany.core.rest.messages.PlcMessageIntercept;
import br.com.powerlogic.treinamento.app.service.IFuncionarioService;
import br.com.powerlogic.treinamento.app.entity.FuncionarioEntity;

/**
 * Rest controller for  "Funcionario"
 *
 * @author jCompany Generator
 *
 */

@PlcAuthenticated
@Path("/entity/funcionario")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@PlcMessageIntercept
public class FuncionarioRest extends PlcAbstractEntityRest<Long, FuncionarioEntity, Object> {

   @Inject
   private IFuncionarioService funcionarioService;

   @Override
   protected IFuncionarioService getEntityService() {
      return funcionarioService;
   }

}
