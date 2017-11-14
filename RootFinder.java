public class RootFinder {

    public static void main(String[] args) {

        Double num = new Double(81);
	Double root = new Double(5);
	Double start = new Double(0);
	Double end = num,
	Double i = new Double(),
	Double number = new Double(),
	Double tmpVar = new Double(),
        Double result = (start + end) / 2;
	    
        for (i = 1.0; i < 1000000.0; i++) {
            number = (start + end) / 2;
            result = number;
            tmpVar = Math.pow(number, root);
			if (tmpVar == num) {
				result = number;
				break;
			} else if (tmpVar < num) {
				start = (start + end) / 2;
			} else{
				end = (start + end) / 2;
			}
		}

        System.out.println(root + " root of " + num + " is " + result);
	System.out.println("(" + result + ")^" + root + " = " + Math.pow(result, root));
	}
}
