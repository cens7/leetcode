package simple;


import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class No989 {

    @Test
    public void test() {
        int[] A = new int[] { 1, 2, 0, 0 };
        int k = 34;
        List<Integer> integers = addToArrayForm(A, k);
        System.out.println(integers);
    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        int len = A.length;
        int lastNum = K;
        LinkedList<Integer> ret = new LinkedList<>();

        int i = len - 1;
        while (i >= 0 || lastNum > 0) {
            if (i >= 0) {
                lastNum += A[i];
            }
            ret.addFirst(lastNum % 10);
            lastNum /= 10;
            i--;
        }

        return ret;
    }

}
