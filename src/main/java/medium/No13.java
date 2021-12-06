package medium;

import org.junit.Test;

/**
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * @author huangh
 * @version $
 * @since 2021年12月06日 11:28:11
 */
public class No13 {

    @Test
    public void test() {
        String str = "DCXXI"; // MCMXCIV XI IX IV DCXXI
        int sum = romanToInt(str);
        System.out.println(sum);
    }

    public int romanToInt(String s) {

        char[] chars = s.toCharArray();
        int len = chars.length;
        int sum = 0;
        int preNum = 0;
        for (int i = 0; i < len; i++) {
            char c = chars[i];
            int num = getValue(c);
            if (preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    public int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

}
