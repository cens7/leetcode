package senior;

import org.junit.Test;

public class No862 {

    @Test
    public void test(){

    }

    public int shortestSubarray(int[] A, int K) {

        int sum=0;

        for (int i : A) {
            sum += i;
        }
        if(sum == K){
            return sum;
        }else{
            return -1;
        }

    }

}
