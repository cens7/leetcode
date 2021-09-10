package medium;

import org.junit.Test;

/**
 * @author huangh
 * @version $
 * @since 2021年09月10日 16:47:32
 */
public class No1894 {


    @Test
    public void test() {
        int[] chalk = new int[] { 3, 4, 1, 2 };
        int k = 25;
        System.out.println(chalkReplacer(chalk, k));
    }

    public int chalkReplacer(int[] chalk, int k) {

        int len = chalk.length;
        int lenLess1 = len - 1;
        for (int i = 0; i < len; i++) {
            int v = chalk[i];
            if (v > k) {
                return i;
            }
            k = k - v;

            if (i == lenLess1) {
                i = -1;
            }
        }
        return 0;

    }

}
