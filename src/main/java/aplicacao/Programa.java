package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // Instancia o "EntityManagerFactory" com as informa��es da classe "persistence".
		EntityManager em = emf.createEntityManager(); // Instancia��o que conecta ao banco de dados e contexto de persist�ncia.
		
//------Fun��o para apagar objeto no banco de dados.
		
		Pessoa p = em.find(Pessoa.class, 2); // Pesquisa no BD
		em.getTransaction().begin(); // Sempre que for remover um objeto � necess�rio criar uma transa��o... 
		em.remove(p); // Remove objeto do BD que esta MONITORADO. � um objeto que voc� acabou de inserir ou que buscou no BD.
		em.getTransaction().commit(); //... e encerr�-la.
		
		System.out.println("Pronto!");
		em.close(); // Fecha o Entity Manager depois de us�-lo.
		emf.close(); // Fecha o Entity Manager Factory depois de us�-lo.
		
	}
}
