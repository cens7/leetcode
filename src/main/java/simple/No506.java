package simple;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

/**
 * @author huangh
 * @version $
 * @since 2021年12月02日 14:52:59
 */
public class No506 {

    @Test
    public void test() {
        int[] score = new int[] { 5, 4, 3, 2, 1 };
        int[] score2 = new int[] { 10, 3, 8, 9, 4 };
        String[] ranks = findRelativeRanks(score2);
        System.out.println(ranks);
    }

    public String[] findRelativeRanks(int[] score) {
        int[] cloneSort = score.clone();
        Arrays.sort(cloneSort);
        String[] msg = new String[] { "Gold Medal", "Silver Medal", "Bronze Medal" };
        String[] s = new String[score.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = cloneSort.length;
        for (int i = len - 1; i >= 0; i--) {
            map.put(cloneSort[i], len - 1 - i);
        }
        for (int i = 0; i < len; i++) {
            int rank = map.get(score[i]);
            s[i] = rank < 3 ? msg[rank] : String.valueOf(rank + 1);

        }
        return s;
    }

}
