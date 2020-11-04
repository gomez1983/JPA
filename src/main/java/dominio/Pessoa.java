package dominio;

import java.io.Serializable;

import javax.persistence.Entity; //Sempre dar preferência ao JavaX.persistence
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

//--Mapeamento de classe
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer ig;
	private String nome;
	private String email;
	
	public Pessoa() {
	}

	public Pessoa(Integer ig, String nome, String email) {
		this.ig = ig;
		this.nome = nome;
		this.email = email;
	}

	public Integer getIg() {
		return ig;
	}

	public void setIg(Integer ig) {
		this.ig = ig;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [ig=" + ig + ", nome=" + nome + ", email=" + email + "]";
	}

}
