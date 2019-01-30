package simple;

import org.junit.Test;

public class No961 {

    @Test
    public void test(){

    }

    public int repeatedNTimes(int[] A) {
        int result = 0;
        int n = A.length/2;

        for (int i : A) {
            int count = 0;
            for (int j: A) {
                if(i == j){
                    count ++;
                }
            }
            if(count == n){
                result = i;
                break;
            }
        }
        return result;
    }

    // 最快
    public int repeatedNTimesFastest(int[] A) {
        int temp = A[0];
        for(int i = 1; i < A.length; i++){
            if(A[i] == temp)
                return temp;
            else if(i < A.length-1){
                temp = A[++i];
            }
        }
        if(A[2] == A[0] || A[3] == A[0])
            return A[0];
        else
            return A[1];
    }

}
