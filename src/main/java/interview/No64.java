package interview;


import org.junit.Test;

public class No64 {

    @Test
    public void test() {
        System.out.println(sumNums(9));
    }

    public int sumNums(int n) {
        int sum = sum(n);
        return sum;
    }

    private int sum(int n) {
        if (n <= 0) {
            return n;
        } else {
            return n + sum(n - 1);
        }

    }

}
