class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor = image[sr][sc];

        // If both colors are same, no change is needed
        if (oldColor == color) {
            return image;
        }

        dfs(image, sr, sc, oldColor, color);

        return image;
    }

    public void dfs(
            int[][] image,
            int row,
            int col,
            int oldColor,
            int newColor) {

        // Check boundaries
        if (row < 0 || row >= image.length ||
            col < 0 || col >= image[0].length) {
            return;
        }

        // Stop if current cell does not have old color
        if (image[row][col] != oldColor) {
            return;
        }

        // Change current cell color
        image[row][col] = newColor;

        // Visit all 4 directions
        dfs(image, row - 1, col, oldColor, newColor);
        dfs(image, row + 1, col, oldColor, newColor);
        dfs(image, row, col - 1, oldColor, newColor);
        dfs(image, row, col + 1, oldColor, newColor);
    }
}