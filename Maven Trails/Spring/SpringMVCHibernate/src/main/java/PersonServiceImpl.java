@org.springframework.stereotype.Service
public class PersonServiceImpl implements PersonService {
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@org.springframework.transaction.annotation.Transactional
	public void addPerson(Person p) {
		this.personDAO.addPerson(p);
	}

	@org.springframework.transaction.annotation.Transactional
	public void updatePerson(Person p) {
		this.personDAO.updatePerson(p);
	}

	@org.springframework.transaction.annotation.Transactional
	public java.util.List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

	@org.springframework.transaction.annotation.Transactional
	public Person getPersonById(int id) {
		return this.personDAO.getPersonById(id);
	}

	@org.springframework.transaction.annotation.Transactional
	public void removePerson(int id) {
		this.personDAO.removePerson(id);
	}
}