package LinkedList;

public class Test {
    int a;

    public static void main(String args[]) {
        Exam ex = new Exam();

<<<<<<< HEAD
		ex.a = 1;

		System.out.println(ex.a);
	}
}

class Exam {
	int a;
	static int i = 1;
=======
        ex.a = 1;
        // x.ex.a=2;
        // ex.ex.ex.a=3;

        System.out.println(ex.a);
        // System.out.println(ex.ex.a);
        // System.out.println(ex.ex.ex.a);
    }
}

class Exam {
    static int i = 1;
    int a;
    // Exam ex = new Exam();
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3

    Exam() {
        System.out.println("this is from level " + i);
        i++;
    }
}