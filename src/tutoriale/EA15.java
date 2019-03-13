package tutoriale;

public class EA15 {

	public static int[][] getMatrixSum(int[][] matrix1, int[][] matrix2) {
		int[][] newMatrix = new int[matrix1.length][matrix1.length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return newMatrix;
	}

}
