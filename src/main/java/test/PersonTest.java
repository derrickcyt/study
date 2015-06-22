package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pojo.Person;

public class PersonTest {

	public void persist(String name) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("sample");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(new Person(name));
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

	public Person find(Integer id) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("sample");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Person person = em.find(Person.class, id);
		System.out.println("现在名字：" + person.getName());
		em.getTransaction().commit();
		em.close();
		factory.close();
		return person;
	}

	public void update(Integer id, String name) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("sample");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		Person person = em.find(Person.class, id);
		System.out.println("原来name:" + person.getName());
		person.setName(name);
		em.merge(person);
		em.getTransaction().commit();
		em.close();
		factory.close();

	}

	public void delete(Integer id) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("sample");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		em.remove(em.find(Person.class, id));
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

	public static void main(String[] args) {
		PersonTest pt = new PersonTest();
		pt.persist("程国宾");

	}

}
