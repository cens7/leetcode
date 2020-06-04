package medium;

import org.junit.Test;

/**
 * @author kongshan
 * @date 2020-06-04 15:54
 */
public class No238 {

    @Test
    public void test() {
        int[] i = {1, 2, 3, 4};
        int[] ints = productExceptSelf(i);
        System.out.println(ints);

    }

    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;

        int[] result = new int[length];

        for (int i = 0; i < length; i++) {

            int tmp = 1;

            for (int j = 0; j < length; j++) {

                if(i == j){
                    continue;
                }

                tmp *= nums[j];

            }

            result[i] = tmp;

        }

        return result;
    }

}
