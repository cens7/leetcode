package simple;

import org.junit.Test;

public class No922 {


    @Test
    public void test(){
        int[]arr = new int[]{4,2,5,7};

        int[] narr = sortArrayByParityII(arr);
        System.out.println(narr);

    }

    public int[] sortArrayByParityII(int[] A) {
        int[] arr = new int[A.length];
        int len = A.length;
        for (int i = 0; i < len; i++) {

            if((i ^ 1) == 0){
                for (int j = i; j < len; j++) {
                    if((A[j] ^ 1) == 0){
                        arr[i] = A[j];
                        break;
                    }
                }
            }else{
                for (int j = i; j < len; j++) {
                    if((A[j] ^ 1) == 1){
                        arr[i] = A[j];
                        break;
                    }
                }
            }


        }
        return arr;

    }

}
