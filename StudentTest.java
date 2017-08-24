class Student {
    String name;
    int rollno, age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
	public void displayName() {
		System.out.println(getName());
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student std = new Student();
		std.name = "John";
		std.displayName();
=======
    public void displayName() {
        System.out.println(getName());
    }

<<<<<<< HEAD
		Student std1 = new Student();
		std1.name = "Paul";
		std1.displayName();
		System.out.println(std1.toString());
		System.out.println(std);
	}
=======
	/*
     * public String toString() { return "Student [name=" + name + ", rollno=" +
	 * rollno + ", age=" + age + "]"; }
	 */
}

public class StudentTest {
    public static void main(String... args) {
        Student std = new Student();
        std.name = "John";
        std.displayName();
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3

        Student std1 = new Student();
        std1.name = "Paul";
        std1.displayName();
        System.out.println(std1.toString());
        System.out.println(std);

    }
>>>>>>> 33b134ffcfd6c8fe383a437bb67eba133b4b2029
}