public class PasswordGenerator {
	public static void main(String[] xyz) {
		String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", chars = "abcdefghijklmnopqrstuvwxyz", nums = "0123456789",
				symbols = "!@#$%^&*_=+-/.?<>(){}", password = "";

		java.util.Random rnd = new java.util.Random();

		for (int i = 0; i < 15; i++) {
			switch (i % 4) {
			case 0:
				password += CHARS.charAt(rnd.nextInt(CHARS.length()));
				break;
			case 1:
				password += chars.charAt(rnd.nextInt(chars.length()));
				break;
			case 2:
				password += nums.charAt(rnd.nextInt(nums.length()));
				break;
			case 3:
				password += symbols.charAt(rnd.nextInt(symbols.length()));
				break;
			}
		}
		System.out.println("Your Password : " + password);
	}
}