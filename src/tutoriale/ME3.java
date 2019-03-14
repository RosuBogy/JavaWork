package tutoriale;

import java.util.Arrays;

public class ME3 {
	public static int[][] fill(int[][] matrix, int x, int y) {

		if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || matrix[x][y] != 0) {
			return matrix;
		}

		matrix[x][y] = 2;
		fill(matrix, x - 1, y);
		fill(matrix, x + 1, y);
		fill(matrix, x, y - 1);
		fill(matrix, x, y + 1);

		return new int[][] { {} };
	}

	static int[][] matrix = { { 0, 0, 1, 1, 0 }, { 0, 0, 0, 1, 1 }, { 1, 1, 0, 1, 0 }, { 1, 0, 0, 1, 0 },
			{ 0, 1, 0, 1, 0 } };

	public static void main(String[] args) {
		fill(matrix, 0, 0);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

}
