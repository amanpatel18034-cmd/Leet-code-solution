import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        
        
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }
        

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        grid[0][0] = 1; 
        int[] dRow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dCol = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int distance = curr[2];
            
            if (row == n - 1 && col == n - 1) {
                return distance;
            }
            
            for (int i = 0; i < 8; i++) {
                int nextRow = row + dRow[i];
                int nextCol = col + dCol[i];
                
                if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n 
                        && grid[nextRow][nextCol] == 0) {
                    grid[nextRow][nextCol] = 1;
                    queue.offer(new int[]{nextRow, nextCol, distance + 1});
                }
            }
        }
        
        return -1;
    }
}