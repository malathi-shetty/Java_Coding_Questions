package longest_Increasing_Path_in_Matrix;

public class Longest_Increasing_Path_in_Matrix {

	public static void main(String[] args) {
		// When there is a m x n matrix, find the length of the longest increasing path
		// in the matrix.

		// Example matrix to test the function
		int[][] matrix = { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };

		Longest_Increasing_Path_in_Matrix finder = new Longest_Increasing_Path_in_Matrix();
		int result = finder.findLongestIncreasingPath(matrix);
		System.out.println("Longest Increasing Path Length: " + result);
	}

	public int findLongestIncreasingPath(int[][] matrix) {
		if (matrix.length == 0)
			return 0;

		int rows = matrix.length;
		int cols = matrix[0].length;
		int longestPath = 0;

		// Check each cell for increasing paths
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int pathLength = explore(matrix, i, j, new boolean[rows][cols]);
				if (pathLength > longestPath) {
					longestPath = pathLength; // Update longest path length
				}
			}
		}
		return longestPath; // Return maximum path length
	}

	private int explore(int[][] matrix, int currentRow, int currentCol, boolean[][] visited) {
		if (visited[currentRow][currentCol])
			return 0; // Already visited
		visited[currentRow][currentCol] = true; // Mark as visited

		int maxLength = 1; // Minimum path length is 1
		int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // Right, Down, Left, Up

		// Explore all four directions
		for (int[] direction : directions) {
			int newRow = currentRow + direction[0];
			int newCol = currentCol + direction[1];

			// Check bounds and increasing order
			if (newRow >= 0 && newRow < matrix.length && newCol >= 0 && newCol < matrix[0].length
					&& matrix[newRow][newCol] > matrix[currentRow][currentCol]) {
				maxLength = Math.max(maxLength, 1 + explore(matrix, newRow, newCol, visited)); // Check neighbors
			}
		}
		visited[currentRow][currentCol] = false; // Unmark as visited
		return maxLength; // Return max path length from this cell

	}
}
