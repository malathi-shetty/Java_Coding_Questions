package largest_Rectangle_in_Binary_Matrix;

import java.util.Stack;

public class Largest_Rectangle_in_Binary_Matrix {

	// Given a binary matrix, find the largest rectangle containing only 1's and
	// return its area.

	public int maximalRectangle(char[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return 0; // Handle empty matrix
		}

		int maxArea = 0; // To track the maximum area

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				// If we find a '1', start calculating the area
				if (matrix[i][j] == '1') {
					int width = 0;
					// Expand horizontally to find width
					while (j + width < matrix[0].length && matrix[i][j + width] == '1') {
						width++;
					}

					// Expand vertically to find height
					int height = 0;
					boolean valid = true;
					while (i + height < matrix.length && valid) {
						for (int k = 0; k < width; k++) {
							if (matrix[i + height][j + k] == '0') {
								valid = false;
								break;
							}
						}
						if (valid) {
							height++;
						}
					}

					// Calculate the area and update maxArea
					int area = width * height;
					maxArea = Math.max(maxArea, area);
				}
			}
		}

		return maxArea; // Return the largest area found
	}

	public static void main(String[] args) {
		Largest_Rectangle_in_Binary_Matrix rec = new Largest_Rectangle_in_Binary_Matrix();
		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };

		System.out.println("The area of the largest rectangle is: " + rec.maximalRectangle(matrix));

	}
}