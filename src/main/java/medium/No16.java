package medium;

import org.junit.Test;

/**
 * @author huangh
 * @version $
 * @since 2020年06月24日 下午15:12
 */
public class No16 {

    /**
     * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
     * 找出 nums 中的三个整数，使得它们的和与 target 最接近。
     * 返回这三个数的和。假定每组输入只存在唯一答案。
     * <p>
     *  
     * <p>
     * 示例：
     * <p>
     * 输入：nums = [-1,2,1,-4], target = 1
     * 输出：2
     * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
     */
    @Test
    public void test() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    public int threeSumClosest(int[] nums, int target) {

        int nearest = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    int tmp = nums[i] + nums[j] + nums[k];
                    int near;
                    if (tmp > target) {
                        near = tmp - target;
                    } else {
                        near = target - tmp;
                    }
                    if (near < nearest) {
                        nearest = near;
                        sum = tmp;
                    }
                }

            }
        }
        return sum;
    }

}
