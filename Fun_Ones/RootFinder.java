public class RootFinder {

	public static void main(String[] args) {
		Double num, root, start, end, mid_val, result;

		num = 10d;
		root = 3d;
		mid_val = 0d;

		if (root != 0) {
			start = 0d;
			end = num;

			mid_val = 0d;

			while (mid_val != (start + end) / 2) {
				mid_val = (start + end) / 2;
				result = Math.pow(mid_val, root);

				if (result < num) {
					start = mid_val;
				} else if (result > num) {
					end = mid_val;
				} else {
					break;
				}
			}
		}
		System.out.println(num + "power of " + root + " = " + mid_val);
	}
}