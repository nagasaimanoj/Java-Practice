package LinkedList;

public class Test {
	int a;

	public static void main(String args[]) {
		Exam ex = new Exam();

		ex.a = 1;

		System.out.println(ex.a);
	}
}

class Exam {
	int a;
	static int i = 1;

	Exam() {
		System.out.println("this is from level " + i);
		i++;
	}
}