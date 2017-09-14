package gnsmk;

public class Person {
	public String name;
	public int age;

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public Person(String temp1, int temp2) {
		this.name = temp1;
		this.age = temp2;
	}

	public String toString() {
		return this.name + " - " + this.age;
	}
}