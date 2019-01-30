package simple;

import org.junit.Test;

public class No292 {

    @Test
    public void test(){
        System.out.println(canWinNim(5));
    }

    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

}
