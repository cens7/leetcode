package medium;

import org.junit.Test;

public class No807 {

    @Test
    public void test() {

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int[][] newGrid = new int[grid.length][];
        int[][] coord = new int[2][];

        int[] xArr = new int[grid.length];
        int[] yArr = new int[grid.length];



        for (int i = 0; i < grid.length; i++) {
            int xheight = grid[i][0];
            for (int j = 1; j < grid[i].length; j++) {
                if (grid[i][j] > xheight) {
                    xheight = grid[i][j];
                }
            }
            xArr[i] = xheight;

        }
        return 0;

    }

}
