package simple;

import org.junit.Test;

import java.util.HashSet;

public class No575 {

    @Test
    public void test(){

    }

    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }

        int len = candies.length/2;
        int size = set.size();
        if( size< len){
            return size;
        }else{
            return len;
        }

    }

    // 最快
    public int distributeCandiesFastest(int[] candies) {
        boolean [] b = new boolean[200001];
        int num = 0;
        for (int i : candies){
            if(b[i + 100000]==false){
                b[i + 100000]=true; num++;
            }
        }
        return Math.min(candies.length/2,num);
        //return nonEmptyBucketNo ;
    }

}
