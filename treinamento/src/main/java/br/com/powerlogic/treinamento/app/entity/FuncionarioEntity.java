
package br.com.powerlogic.treinamento.app.entity;

import com.powerlogic.jcompany.core.model.entity.IPlcLogicalExclusion;
import com.powerlogic.jcompany.core.model.entity.PlcVersionedEntity;
import com.powerlogic.jcompany.core.model.domain.PlcSituacao;





import java.util.Date;
import java.util.List;

import javax.persistence.*;

import javax.validation.constraints.*;
import javax.xml.bind.annotation.*;

/**
 * Persistent class for entity stored in table "FUNCIONARIO"
 *
 * @author jCompany Generator
 *
 */

@Entity
@Table(name="FUNCIONARIO", schema="RHDEMO", catalog="TEST" )
@SequenceGenerator(name = "SE_FUNCIONARIO", sequenceName = "SE_FUNCIONARIO")
@Access(AccessType.FIELD)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
// Define named queries here
@NamedQueries ( {
    @NamedQuery(name = "FuncionarioEntity.find", query = "SELECT o FROM FuncionarioEntity o"),
} )
public class FuncionarioEntity extends PlcVersionedEntity<Long> implements IPlcLogicalExclusion {

    private static final long serialVersionUID = 1L;

	/**
	 *  Construtor Default
	 */
	public FuncionarioEntity() {}
	
	/** Construtor
	 * 
	 * @param id
	 */
	public FuncionarioEntity(Long id) {
		this.id = id;
	}
	





    @Column(name="ID")

    private Long       id           ;

    @Column(name="CPF", length=255)
    @Size( max = 255 )
    private String     cpf          ;

    @Temporal(TemporalType.DATE)
    @Column(name="DATANASCIMENTO")

    private Date       datanascimento ;

    @Column(name="EMAIL", length=255)
    @Size( max = 255 )
    private String     email        ;

    @Column(name="ESTADOCIVIL", length=1)
    @Size( max = 1 )
    private String     estadocivil  ;

    @Column(name="NOME", length=255)
    @Size( max = 255 )
    private String     nome         ;

    @Column(name="OBSERVACAO", length=255)
    @Size( max = 255 )
    private String     observacao   ;

    @Column(name="SEXO", length=1)
    @Size( max = 1 )
    private String     sexo         ;

    @Column(name="SITHISTORICOPLC", length=255)
    @Size( max = 255 )
    private String     sithistoricoplc ;

    @Column(name="TEMCURSOSUPERIOR")

    private Long       temcursosuperior ;

    @Column(name="ID_FOTO")

    private Long       foto         ;



    @ManyToOne
    @JoinColumn(name="DEPARTAMENTO_PK_DEPARTAMENTO", referencedColumnName="PK_DEPARTAMENTO")
    private DepartamentoEntity departamento;


    



    public void setId( Long id ) {
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }
    public void setCpf( String cpf ) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setDatanascimento( Date datanascimento ) {
        this.datanascimento = datanascimento;
    }
    public Date getDatanascimento() {
        return this.datanascimento;
    }
    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEstadocivil( String estadocivil ) {
        this.estadocivil = estadocivil;
    }
    public String getEstadocivil() {
        return this.estadocivil;
    }
    public void setNome( String nome ) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setObservacao( String observacao ) {
        this.observacao = observacao;
    }
    public String getObservacao() {
        return this.observacao;
    }
    public void setSexo( String sexo ) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSithistoricoplc( String sithistoricoplc ) {
        this.sithistoricoplc = sithistoricoplc;
    }
    public String getSithistoricoplc() {
        return this.sithistoricoplc;
    }
    public void setTemcursosuperior( Long temcursosuperior ) {
        this.temcursosuperior = temcursosuperior;
    }
    public Long getTemcursosuperior() {
        return this.temcursosuperior;
    }
    public void setFoto( Long foto ) {
        this.foto = foto;
    }
    public Long getFoto() {
        return this.foto;
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
        sb.append("]:"); 
        sb.append(id);
        sb.append("|");
        sb.append(cpf);
        sb.append("|");
        sb.append(datanascimento);
        sb.append("|");
        sb.append(email);
        sb.append("|");
        sb.append(estadocivil);
        sb.append("|");
        sb.append(nome);
        sb.append("|");
        sb.append(observacao);
        sb.append("|");
        sb.append(sexo);
        sb.append("|");
        sb.append(sithistoricoplc);
        sb.append("|");
        sb.append(temcursosuperior);
        sb.append("|");
        sb.append(foto);
        return sb.toString(); 
    } 

}
