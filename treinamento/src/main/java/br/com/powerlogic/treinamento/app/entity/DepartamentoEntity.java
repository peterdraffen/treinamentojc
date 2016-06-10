
package br.com.powerlogic.treinamento.app.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * Persistent class for entity stored in table "DEPARTAMENTO"
 *
 * @author jCompany Generator
 *
 */

@Entity
@Table(name="DEPARTAMENTO", schema="RHDEMO", catalog="TEST" )
@SequenceGenerator(name = "SE_DEPARTAMENTO", sequenceName = "SE_DEPARTAMENTO", allocationSize = 1)
@Access(AccessType.FIELD)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
// Define named queries here
@NamedQueries ( {
    @NamedQuery(name = "DepartamentoEntity.find", query = "SELECT o FROM DepartamentoEntity o"),
} )
public class DepartamentoEntity extends PlcVersionedEntity<Long> implements IPlcLogicalExclusion {

    private static final long serialVersionUID = 1L;

	/**
	 *  Construtor Default
	 */
	public DepartamentoEntity() {}
	
	/** Construtor
	 * 
	 * @param id
	 */
	public DepartamentoEntity(Long id) {
		this.id = id;
	}
	




	@Id
    @Column(name="PK_DEPARTAMENTO")
    @GeneratedValue(generator="SE_DEPARTAMENTO", strategy=GenerationType.SEQUENCE)
    private Long       id           ;

    @Column(name="DESCRICAO", length=100)
    @Size( max = 100 )
    private String     descricao    ;



    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name="ID_DEPARTAMENTO_PAI", referencedColumnName="PK_DEPARTAMENTO")
    private DepartamentoEntity departamento;

    public void setId( Long id ) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setDescricao( String descricao ) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }

    public void setDepartamento( DepartamentoEntity departamento ) {
        this.departamento = departamento;
    }
    public DepartamentoEntity getDepartamento() {
        return this.departamento;
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
        sb.append("Departamento"); 
        sb.append("]:"); 
        sb.append(id);
        sb.append("|");
        sb.append(descricao);
        return sb.toString(); 
    } 

}
