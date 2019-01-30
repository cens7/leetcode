package simple;

import org.junit.Test;

public class No463 {

    @Test
    public void test(){
        int [][] ints = new int[][]{
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0}};
        System.out.println(islandPerimeter(ints));
    }

    public int islandPerimeter(int[][] grid) {

        int sum = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1){

                    if(j == 0){
                        sum += 1;
                    }else{
                        if(grid[i][j-1] == 0){
                            sum += 1;
                        }
                    }
                    if(j+1 == grid[i].length){
                        sum+= 1;
                    }else{
                        if(grid[i][j+1] == 0){
                            sum += 1;
                        }
                    }

                    if(i == 0){
                        sum += 1;
                    }else{
                        if(grid[i-1][j] == 0){
                            sum += 1;
                        }
                    }

                    if(i+1 == grid.length){
                        sum += 1;
                    }else{
                        if(grid[i+1][j] == 0){
                            sum += 1;
                        }
                    }

                }
            }

        }
        return sum;
    }

    // 最快
    public int islandPerimeterFastest(int[][] grid) {
        int count = 0;//record the value of the answer
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == 1){
                    count += 4;
                    if(i - 1 >= 0 && grid[i - 1][j] == 1){
                        count -= 2;
                    }
                    if(j - 1 >= 0 && grid[i][j - 1] == 1){
                        count -= 2;
                    }
                }

            }
        }
        return count;
    }

}
