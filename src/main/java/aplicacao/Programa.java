package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // Instancia o "EntityManagerFactory" com as informações da classe "persistence".
		EntityManager em = emf.createEntityManager(); // Instanciação que conecta ao banco de dados e contexto de persistência.
		
		em.getTransaction().begin(); // Inicia uma transação no banco de dados.
		em.persist(p1); // "persist" é o código que pega o objeto e o salva no banco de dados.
		em.persist(p2); // "persist" é o código que pega o objeto e o salva no banco de dados.
		em.persist(p3); // "persist" é o código que pega o objeto e o salva no banco de dados.
		em.getTransaction().commit(); // Confirma a transação no banco de dados.
		System.out.println("Pronto!");

	}
}
