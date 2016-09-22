package diagram.agenda.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
 * Classe que representa a tabela AGENDA
 * @generated
 */
@Entity
@Table(name = "\"AGENDA\""


)
@XmlRootElement
public class Agenda implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1959137283l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id", insertable=true, updatable=true)
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
	private java.lang.String nome;
	
	/**
	 * @generated
	 */
	@Column(name = "telefone", nullable = false, unique = false, insertable=true, updatable=true)
	private java.lang.String telefone;
	
	/**
	 * @generated
	 */
	@Column(name = "endereco", nullable = false, unique = false, insertable=true, updatable=true)
	private java.lang.String endereco;
	
	
		/**
	 * @generated
	 */
	@Column(name = "cidade", nullable = false, unique = false, insertable=true, updatable=true)
	private java.lang.String cidade;
	
	/**
	 * Construtor
	 * @generated
	 */
	public Agenda(){
	}

	
	/**
	 * Obtém id
	 * @param id id
	 * return id
	 * @generated
	 */
	public java.lang.String getId(){
		return this.id;
	}
	
	/**
	 * Define id
	 * @param id id
	 * @generated
	 */
	public Agenda setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém nome
	 * @param nome nome
	 * return nome
	 * @generated
	 */
	public java.lang.String getNome(){
		return this.nome;
	}
	
	/**
	 * Define nome
	 * @param nome nome
	 * @generated
	 */
	public Agenda setNome(java.lang.String nome){
		this.nome = nome;
		return this;
	}
	
	/**
	 * Obtém telefone
	 * @param telefone telefone
	 * return telefone
	 * @generated
	 */
	public java.lang.String getTelefone(){
		return this.telefone;
	}
	
	/**
	 * Define telefone
	 * @param telefone telefone
	 * @generated
	 */
	public Agenda setTelefone(java.lang.String telefone){
		this.telefone = telefone;
		return this;
	}
	
	/**
	 * Obtém endereco
	 * @param endereco endereco
	 * return endereco
	 * @generated
	 */
	public java.lang.String getEndereco(){
		return this.endereco;
	}
	
	/**
	 * Define endereco
	 * @param endereco endereco
	 * @generated
	 */
	public Agenda setEndereco(java.lang.String endereco){
		this.endereco = endereco;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
	
	/**
	 * @generated
	 */	
	@Override
  	public boolean equals(Object obj) {
    
	    if(this == obj)
	      return true;
	    
	    if(obj == null)
	      return false;
	    
	    if(!(obj instanceof Agenda))
	      return false;
	    
	    Agenda other = (Agenda)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
