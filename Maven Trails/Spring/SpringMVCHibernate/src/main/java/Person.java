@javax.persistence.Entity
@javax.persistence.Table(name = "PERSON")
public class Person {

	@javax.persistence.Id
	@javax.persistence.Column(name = "id")
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private int id;
	private String name;
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int temp) {
		id = temp;
	}

	public String getName() {
		return name;
	}

	public void setName(String temp) {
		name = temp;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String temp) {
		country = temp;
	}

	public String toString() {
		return "id = " + id + ", name = " + name + ", country = " + country;
	}
}