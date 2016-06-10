
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
 * Persistent class for entity stored in table "UNIDADEFEDERATIVA"
 *
 * @author jCompany Generator
 *
 */

@Entity
@Table(name="UNIDADEFEDERATIVA", schema="RHDEMO", catalog="TEST" )
@SequenceGenerator(name = "SE_UNIDADEFEDERATIVA", sequenceName = "SE_UNIDADEFEDERATIVA", allocationSize = 1)
@Access(AccessType.FIELD)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
// Define named queries here
@NamedQueries ( {
    @NamedQuery(name = "UfEntity.find", query = "SELECT o FROM UfEntity o"),
} )
public class UfEntity extends PlcVersionedEntity<Long> implements IPlcLogicalExclusion {

    private static final long serialVersionUID = 1L;

	/**
	 *  Construtor Default
	 */
	public UfEntity() {}
	
	/** Construtor
	 * 
	 * @param id
	 */
	public UfEntity(Long id) {
		this.id = id;
	}
	




	@Id
    @Column(name="PK_UNIDADEFEDERATIVA")
	@GeneratedValue(generator="SE_UNIDADEFEDERATIVA", strategy=GenerationType.SEQUENCE)
    private Long       id           ;

    @Column(name="NOME", length=100)
    @Size( max = 100 )
    private String     nome         ;

    @Column(name="SIGLA", length=60)
    @Size( max = 60 )
    private String     sigla        ;




    



    public void setId( Long id ) {
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }
    public void setNome( String nome ) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setSigla( String sigla ) {
        this.sigla = sigla;
    }
    public String getSigla() {
        return this.sigla;
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
        sb.append("UfEntity"); 
        sb.append("]:"); 
        sb.append(id);
        sb.append("|");
        sb.append(nome);
        sb.append("|");
        sb.append(sigla);
        return sb.toString(); 
    } 

}
