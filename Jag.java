public class Jag {
    public static void main(String args[]) {

<<<<<<< HEAD
		int[][] array2d = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11, 12 } };

		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.print(array2d[i][j] + "\t");
			}
			System.out.println();
		}
	}
=======
        int[] OneDimensionalArray1 = {1, 2, 3};

        int[] oneDimensionalArray2 = {4, 5, 6, 7};

        int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};

        int[][] twoDimensionalArray = {OneDimensionalArray1, oneDimensionalArray2, oneDimensionalArray3};

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
}