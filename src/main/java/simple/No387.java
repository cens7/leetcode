package simple;

import org.junit.Test;

public class No387 {

    @Test
    public void test(){
        String s = "z";//"" "cc" z
        System.out.println(firstUniqChar("z"));
        System.out.println(firstUniqChar(""));
        System.out.println(firstUniqChar("cc"));
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("aadadaad"));
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {

        int len = s.length();
        if(len == 0){
            return -1;
        }else if(len == 1){
            return 0;
        }else{

            int idx = -1;

            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                boolean temp = true;
                int j=1;
                for (; j < chars.length; j++) {
                    if(chars[i] == chars[j]){
                        temp = false;
                        break;
                    }

                }
                if(temp){
                    if(i+1 != j){
                        return i;
                    }else{
                        return j;
                    }
                }
            }

            return idx;

        }
    }
}
