package simple;

import org.junit.Test;

/**
 * @author huangh
 * @version $
 * @since 2021年12月01日 11:28:02
 */
public class No1446 {

    @Test
    public void test() {
        String s = "tourist";
        int i = maxPower(s);
        System.out.println(i);
    }

    public int maxPower(String s) {

        int maxLen = 1;
        int len = 1;
        char preChar = ' ';
        for (char c : s.toCharArray()) {
            if (preChar == c) {
                len += 1;
                if (len > maxLen) {
                    maxLen = len;
                }
            } else {
                len = 1;
            }

            preChar = c;
        }
        return maxLen;
    }

}
