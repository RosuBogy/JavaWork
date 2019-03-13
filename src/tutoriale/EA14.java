package tutoriale;

public class EA14 {
	public static int[][] getMatrixProduct(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix1.length][matrix2[0].length];

		for (int k = 0; k < matrix1.length; k++) {
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					result[k][i] += matrix1[k][j] * matrix2[j][i];
				}
			}
		}
		return result;
	}

}
