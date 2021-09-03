package interview;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author huangh
 * @version $
 * @since 2021年09月03日 14:44:30
 */
public class No17 {

    @Test
    public void test() {
        int[] arr = new int[] { 1, 3, 5, 7, 2, 4, 6, 8 };
        int k = 4;
        int[] ints = smallestK(arr, k);
        System.out.println(ints);
    }


    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;

    }

}
