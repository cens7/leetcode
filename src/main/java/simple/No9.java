package simple;


import org.junit.Test;

public class No9 {


    @Test
    public void test() {

    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rem, y = 0;
        int quo = x;
        while (quo != 0) {
            rem = quo % 10;
            y = y * 10 + rem;
            quo = quo / 10;
        }
        return y == x;

    }


}
