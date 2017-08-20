interface Test {
    abstract void greet();
}

public class Demo {
<<<<<<< HEAD
	public static void main(String[] args) {
		new Test() {
			public void greet() {
				System.out.print("\nHi, Best wishes to way2java.com\n");
			}
		}.greet();
	}
=======
    public static void main(String[] args) {
        Test t = new Test() {
            public void greet() {
                System.out.print("\nHi, Best wishes to way2java.com\n");
            }
        };
        t.greet();
    }
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
}