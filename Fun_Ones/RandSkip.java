public class RandSkip {
	public static void main(String[] args) {
		int a, i = 0;
		while (((a = new java.util.Random().nextInt(10)) != 5) && i < 100) {
			i++;
			System.out.println(a);
		}
	}
}