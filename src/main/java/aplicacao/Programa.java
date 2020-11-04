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
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // Instancia o "EntityManagerFactory" com as informa��es da classe "persistence".
		EntityManager em = emf.createEntityManager(); // Instancia��o que conecta ao banco de dados e contexto de persist�ncia.
		
		em.getTransaction().begin(); // Inicia uma transa��o no banco de dados.
		em.persist(p1); // "persist" � o c�digo que pega o objeto e o salva no banco de dados.
		em.persist(p2); // "persist" � o c�digo que pega o objeto e o salva no banco de dados.
		em.persist(p3); // "persist" � o c�digo que pega o objeto e o salva no banco de dados.
		em.getTransaction().commit(); // Confirma a transa��o no banco de dados.
		System.out.println("Pronto!");

	}
}
