package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // Instancia o "EntityManagerFactory" com as informações da classe "persistence".
		EntityManager em = emf.createEntityManager(); // Instanciação que conecta ao banco de dados e contexto de persistência.
		
//------Função para apagar objeto no banco de dados.
		
		Pessoa p = em.find(Pessoa.class, 2); // Pesquisa no BD
		em.getTransaction().begin(); // Sempre que for remover um objeto é necessário criar uma transação... 
		em.remove(p); // Remove objeto do BD que esta MONITORADO. É um objeto que você acabou de inserir ou que buscou no BD.
		em.getTransaction().commit(); //... e encerrá-la.
		
		System.out.println("Pronto!");
		em.close(); // Fecha o Entity Manager depois de usá-lo.
		emf.close(); // Fecha o Entity Manager Factory depois de usá-lo.
		
	}
}
