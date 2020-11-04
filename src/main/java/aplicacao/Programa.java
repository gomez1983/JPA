package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // Instancia o "EntityManagerFactory" com as informações da classe "persistence".
		EntityManager em = emf.createEntityManager(); // Instanciação que conecta ao banco de dados e contexto de persistência.
		
//------Função que busca um objeto pelo ID no banco de dados.
		
		Pessoa p = em.find(Pessoa.class, 2); // Pesquisa no BD, converte o dado em objeto e o instancia.
		
		System.out.println(p);
		
		System.out.println("Pronto!");
		em.close(); // Fecha o Entity Manager depois de usá-lo.
		emf.close(); // Fecha o Entity Manager Factory depois de usá-lo.
		
	}
}
