@org.springframework.stereotype.Repository
public class PersonDAOImpl implements PersonDAO {
	private org.hibernate.SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public void addPerson(Person p) {
		org.hibernate.Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
	}

	public void updatePerson(Person p) {
		org.hibernate.Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
	}

	@SuppressWarnings
	public java.util.List<Person> listPersons() {
		org.hibernate.Session session = this.sessionFactory.getCurrentSession();
		java.util.List<Person> personsList = session.createQuery("from Person").list();
		return personsList;
	}

	public Person getPersonById(int id) {
		org.hibernate.Session session = this.sessionFactory.getCurrentSession();
		Person p = (Person) session.load(Person.class, new Integer(id));
		return p;
	}

	public void removePerson(int id) {
		org.hibernate.Session session = this.sessionFactory.getCurrentSession();
		Person p = (Person) session.load(Person.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}
}