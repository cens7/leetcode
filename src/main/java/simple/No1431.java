/*
 * Copyright (C) 2013-2020 Hangzhou Youyun Technology Co., Ltd. All rights reserved
 */

package simple;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author kongshan
 * @date 2020-06-04 16:23
 */
public class No1431 {

    @Test
    public void test() {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        List<Boolean> list = new LinkedList<>();

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(Boolean.TRUE);
            } else {
                list.add(Boolean.FALSE);
            }
        }

        return list;
    }
}
