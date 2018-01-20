class CompositionTest {
	public static void main(String[] args) {

		java.util.List<Student> students = new java.util.ArrayList<Student>();
		students.add(new Student(1, "Student1", "Department1"));
		students.add(new Student(2, "Student2", "Department1"));
		students.add(new Student(3, "Student3", "Department1"));

		for (Student s : (new Department("Department", students)).getStudents()) {
			System.out.println(s.getRollno() + " " + s.getName() + " " + s.getDepartment());
		}
	}
}