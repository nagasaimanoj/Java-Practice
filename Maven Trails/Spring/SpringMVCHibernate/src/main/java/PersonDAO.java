public interface PersonDAO {
	public void addPerson(Person p);
	public void updatePerson(Person p);
	public java.util.List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
}