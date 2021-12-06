package simple;

import org.junit.Test;

/**
 * @author huangh
 * @version $
 * @since 2021年12月06日 10:45:37
 */
public class No1816 {

    @Test
    public void test() {
        String s = "chopper is not a tanuki";
        int k = 5;
        System.out.println(truncateSentence(s, k));
    }

    public String truncateSentence(String s, int k) {
        String[] strArr = s.split(" ");
        if (strArr.length == k) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(strArr[i]).append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
