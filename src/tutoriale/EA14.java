package tutoriale;

public class EA14 {
	public static int[][] getMatrixProduct(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix1.length][matrix2[0].length];

		for (int resultRow = 0; resultRow < result.length; resultRow++) {
			for (int resultCol = 0; resultCol < result[0].length; resultCol++) {
				int sum = 0;
				for (int i = 0; i < matrix1[0].length; i++) {
					sum += matrix1[resultRow][i] * matrix2[i][resultCol];
				}
			}

		}
	}

}
