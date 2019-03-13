package tutoriale;

public class EA20 {
	public static boolean sudokuChecker(int[][] matrix) {

		int sudokuElem[] = new int[9];
		int sudokuElemIndex = 0;

		if (matrix.length != 3 || matrix[0].length != 3 || matrix[1].length != 3) {
			return false;
		}

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] < 0 || matrix[i][j] > 9) {
					return false;
				}
				for (int elem : sudokuElem) {
					if (elem == matrix[i][j] && matrix[i][j] != 0) {
						return false;
					} else if (matrix[i][j] != 0) {
						sudokuElem[sudokuElemIndex] = matrix[i][j];
						sudokuElemIndex++;
						break;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(sudokuChecker(new int[][] { { 1, 2, 0 }, { 4, 5, 0 }, { 0, 1, 9 } }));

	}

}
