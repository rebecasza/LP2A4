package br.com.ifsp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;


public class Banco {

	EntityManagerFactory emf;
	EntityManager em;
	
	private static List<Livro> listaLivro = new ArrayList<>();
	private static Integer codigo = 1;
	
	public void salvaLivro(Livro livro) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livro"); 
		EntityManager em = emf.createEntityManager(); 
//		
//		em.getTransaction().begin();
//		em.merge(livro); 
//		em.getTransaction().commit();
//		em.close();
//		emf.close();
//		Livro l = null;
		try {
			em.getTransaction().begin();
			if(livro.getId() != null)
				em.unwrap(Session.class).update(livro);
//				em.persist(livro);
				//l = em.find(Livro.class, livro.getId());
				//l.setAutor(autor);
			else {
				em.merge(livro); 
			}
			em.getTransaction().commit();
		}catch(Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
			
		}finally {
			em.close();
			emf.close();
		}
	}

	private void atualizaCliente(Integer id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livro"); 
		EntityManager em = emf.createEntityManager(); 

		try {
			Livro livro = em.find(Livro.class, id);
			em.getTransaction().begin();
			em.remove(livro);
			em.getTransaction().commit();
		
		}catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
			emf.close();
		}
   }
	

	
	private Integer getProximoCodigo() {
		return codigo++;
	}

	public List<Livro> getListaLivro() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livro"); 
		EntityManager em = emf.createEntityManager(); 
		
		List<Livro> listaLivros = null; 

		try {
			listaLivro = em.createQuery("from Livro").getResultList();
//			return listaLivro;
		}catch (Exception e) {
			System.err.println(e);
		} finally {
			em.close();
			emf.close();
		}
		
		return listaLivro;
	}

	public Integer getTamanhoListaCliente() {
		return Banco.listaLivro.size();
	}
	
	public Livro getLivrobyId(Integer id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livro"); 
		EntityManager em = emf.createEntityManager(); 
		
		Livro localiza = null;
		
		try {
			localiza = em.find(Livro.class, id);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			em.close();
			emf.close();
		}
		return localiza;
	}

	public void deletaLivro(Integer id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livro"); 
		EntityManager em = emf.createEntityManager(); 
		
		try {
			Livro livro = em.find(Livro.class, id); 
			em.getTransaction().begin(); 
			em.remove(livro); 
			em.getTransaction().commit();
			
		}catch (Exception e) {
			em.getTransaction().rollback(); 			
		}finally {
			em.close();
			emf.close();
		}
	}
}
