package simple;

import org.junit.Test;

public class No771 {


    @Test
    public void test(){
        String J = "aA";
        String S = "aAAbbbb";
        int i = numJewelsInStones(J,S);
        System.out.println(i);
    }

    public int numJewelsInStones(String J, String S) {
        int num = 0;
        char[] chars = S.toCharArray();

        for (char ch : chars) {
            if(J.indexOf(ch) != -1){
                num ++;
            }
        }
        return num;
    }

    // 最快
    public int numJewelsInStonesFastest(String J, String S) {
        char[] jcs=J.toCharArray();
        char[] scs=S.toCharArray();
        int count = 0;
        for(char jc :jcs){
            for(char sc : scs){
                if(jc == sc){
                    count++;
                }

            }
        }

        return count;
    }

}
