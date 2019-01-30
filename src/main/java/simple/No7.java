package simple;

import org.junit.Test;

public class No7 {

    @Test
    public void test(){

        System.out.println(reverse(1230));
    }

    public int reverse(int x) {
        int res = 0;
        if(x > Integer.MAX_VALUE){
            return 0;
        }
        boolean fs = false;
        if(x<0){
            fs = true;
            x = 0 - x;
        }
        try {
            StringBuffer sb = new StringBuffer(String.valueOf(x));
            res = Integer.parseInt(sb.reverse().toString());
            if(fs) {
                res = 0 - res;
            }
        }catch (Exception e){
            res = 0;
        }finally {
            return res;
        }


    }

}
