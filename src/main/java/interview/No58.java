package interview;

import org.junit.Test;

public class No58 {

    @Test
    public void test() {

        System.out.println(reverseLeftWords("abcdefg", 2));
    }

    public String reverseLeftWords(String s, int n) {

        int length = s.length();

        String s1 = s.substring(0, n);
        String s2 = s.substring(n);

        return s2 + s1;
    }

}
