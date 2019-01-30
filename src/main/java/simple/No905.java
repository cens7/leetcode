package simple;

import org.junit.Test;

public class No905 {

    @Test
    public void test(){


    }


    public int[] sortArrayByParity(int[] A) {

        int[] arr = new int[A.length];
        int l = A.length - 1;
        int n = 0;
        for (int i = 0; i < A.length; i++) {
            int i1 = A[i] & 1;
            if(i1 == 1){
                arr[l] = A[i];
                l--;
            }else{
                arr[n] = A[i];
                n++;
            }
        }
        return arr;
    }


    //最快
    public int[] sortArrayByParityFastest(int[] A) {
        int i = 0;
        int j = A.length-1;
        while(i<j) {
            if(A[i]%2 > A[j]%2){
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
            }
            if(A[i]%2==0) {
                i++;
            }
            if(A[j]%2!=0){
                j--;
            }
        }
        return A;
    }
}
