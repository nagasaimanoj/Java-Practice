public class RandSkip {
<<<<<<< HEAD
	public static void main(String[] args) {
		int a, i = 0;
		while (((a = new java.util.Random().nextInt(10)) != 5) && i < 100) {
			i++;
			System.out.println(a);
		}
	}
=======
    public static void main(String... args) {
        Random rand = new Random();
        int a, i = 0;
        while (((a = rand.nextInt(10)) != 5) && i < 100) {
            i++;
            System.out.println(a);
        }
    }
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
}