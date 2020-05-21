/*
 * Copyright (C) 2013-2020 Hangzhou Youyun Technology Co., Ltd. All rights reserved
 */

package medium;

import org.junit.Test;

/**
 * 盛水最多的容器
 *
 * @author mavic
 * @date 2020-05-21 20:03
 */
public class No11 {

    @Test
    public void test() {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(arr);
        System.out.println(i);
    }

    public int maxArea(int[] height) {

        int maxArea = 0;

        if (height.length == 0) {
            return maxArea;
        }

        for (int i = 0; i < height.length; i++) {

            for (int j = height.length - 1; j > i; j--) {

                int num = height[i] > height[j] ? height[j] : height[i];
                int tmpNum = (j - i) * num;
                if (tmpNum > maxArea) {
                    maxArea = tmpNum;
                }

            }

        }

        return maxArea;

    }

    // 速度最快的
    public int mostMaxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int leftVal = height[left];
            int rightVal = height[right];

            if (leftVal >= rightVal) {
                max = Math.max(max, (right - left) * rightVal);
                while (left < right && height[right] <= rightVal) right--;
            } else {
                max = Math.max(max, (right - left) * leftVal);
                while (left < right && height[left] <= leftVal) left++;
            }
        }
        return max;
    }

}
