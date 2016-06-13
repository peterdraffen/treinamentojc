package br.com.powerlogic.treinamento.app.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.powerlogic.jcompany.core.exception.PlcException;
import com.powerlogic.jcompany.core.rest.auth.PlcAuthenticated;
import com.powerlogic.jcompany.core.rest.auth.PlcNotAuthenticated;
import com.powerlogic.jcompany.core.rest.entity.PlcAbstractEntityRest;
import com.powerlogic.jcompany.core.rest.messages.PlcMessageIntercept;

import br.com.powerlogic.treinamento.app.entity.CursoEntity;
import br.com.powerlogic.treinamento.app.entity.dto.CursoDTO;
import br.com.powerlogic.treinamento.app.service.ICursoService;

/**
 * Rest controller for "Curso"
 *
 * @author jCompany Generator
 *
 */

@PlcAuthenticated
@Path("/entity/curso")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@PlcMessageIntercept
public class CursoRest extends PlcAbstractEntityRest<Long, CursoEntity, Object> {

	@Inject
	private ICursoService cursoService;
	
	@Override
	public List<CursoEntity> findAll(HttpServletRequest request, UriInfo ui) throws PlcException {
		System.out.println("4) PASSOU FINDALL");
		return super.findAll(request, ui);
	}

	@Override
	public CursoEntity get(Long entityId) throws PlcException {
		System.out.println("10) PASSOU GET");
		return super.get(entityId);
	}

	@Override
	protected ICursoService getEntityService() {
		return cursoService;
	}

	@Override
	public CursoEntity save(CursoEntity entity) throws PlcException {
		System.out.println("1) PASSOU REST " + entity.toString());
		return super.save(entity);
	}

	@GET
	@Path("/nomes")
	@PlcNotAuthenticated
	public List<CursoDTO> recuperaNomes() {
		List<CursoDTO> result = new ArrayList<CursoDTO>();
		List<CursoEntity> cursos = cursoService.findAll();
		
		cursos.forEach(curso -> {
			CursoDTO dto = new CursoDTO();
			dto.setNome(curso.getNmTreinamento());
			result.add(dto);
		});
		
		return result;
	}
	
}
