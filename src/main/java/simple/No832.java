package simple;

import org.junit.Test;

public class No832 {
    @Test
    public void test(){
        int[][] arr = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int[][] arr = new int[A.length][];
        for (int m = 0 ; m <A.length; m++) {
            int[] ar = new int[A[m].length];
            int ti = 0;
            for (int i = A[m].length-1; i >=0; i--) {

                ar[ti] = A[m][i];
                ti++;
            }
            ti = 0;
            for (int a : ar) {
                if(a == 1){
                    a = 0;
                }else{
                    a = 1;
                }
                ar[ti] = a;
                ti++;
            }
            arr[m] = ar;
        }

        return arr;
    }


    // 最快
    public int[][] flipAndInvertImageFastest(int[][] A) {
        for (int[] arr:A) {
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            for (int j=0;j<arr.length;j++){
                arr[j]^=1;
            }
        }
        return A;
    }

}
