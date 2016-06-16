
package br.com.powerlogic.treinamento.app.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.powerlogic.jcompany.core.model.domain.PlcSituacao;
import com.powerlogic.jcompany.core.model.entity.IPlcLogicalExclusion;
import com.powerlogic.jcompany.core.model.entity.PlcVersionedEntity;

/**
 * Persistent class for entity stored in table "CURSO"
 *
 * @author jCompany Generator
 *
 */

@Entity
@Table(name="CURSO", schema="RHDEMO", catalog="TEST" )
@SequenceGenerator(name = "SE_CURSO", schema="RHDEMO", sequenceName = "SE_CURSO", allocationSize = 1)
@Access(AccessType.FIELD)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
// Define named queries here
@NamedQueries ( {
    @NamedQuery(name = "CursoEntity.find", query = "SELECT o FROM CursoEntity o"),
    @NamedQuery(name = "CursoEntity.CheckConstraintBeforeSave.unicoNome", query = "SELECT COUNT(o.id) FROM CursoEntity o WHERE o.nmTreinamento = :nmTreinamento AND o.id <> :id AND o.situacao = 'A'")
})
public class CursoEntity extends PlcVersionedEntity<Long> implements IPlcLogicalExclusion {

    private static final long serialVersionUID = 1L;

	/**
	 *  Construtor Default
	 */
	public CursoEntity() {}
	
	/** Construtor
	 * 
	 * @param id
	 */
	public CursoEntity(Long id) {
		this.id = id;
	}
	




	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SE_CURSO")
    @Column(name="PK_CURSO")
    private Long       id           ;

    @Column(name="NM_TREINAMENTO", length=100)
    @Size( max = 100 )
    private String     nmTreinamento ;




    



    public void setId( Long id ) {
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }
    public void setNmTreinamento( String nmTreinamento ) {
        this.nmTreinamento = nmTreinamento;
    }
    public String getNmTreinamento() {
        return this.nmTreinamento;
    }


	@Enumerated(EnumType.STRING)
	@Column(name = "IN_SITUACAO_REGISTRO", nullable = false, length = 1)
	private PlcSituacao situacao;
	
	public PlcSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(PlcSituacao situacao) {
		this.situacao = situacao;
	}

    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append("]:"); 
        sb.append(id);
        sb.append("|");
        sb.append(nmTreinamento);
        return sb.toString(); 
    } 

}
