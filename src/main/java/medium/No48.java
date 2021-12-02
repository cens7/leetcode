package medium;

import org.junit.Test;

/**
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[7,4,1],[8,5,2],[9,6,3]]
 *
 * @author huangh
 * @version $
 * @since 2021年11月18日 17:41:49
 */
public class No48 {


    @Test
    public void test() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(matrix);
        System.out.println(matrix);
    }

    public void rotate(int[][] matrix) {

        int len = matrix.length;
        int[][] result = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int i1 = 0; i1 < len; i1++) {
                result[i1][len - i - 1] = matrix[i][i1];
            }
        }
        for (int i = 0; i < len; i++) {
            System.arraycopy(result[i], 0, matrix[i], 0, len);
        }

    }

}
