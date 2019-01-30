package simple;

import org.junit.Test;

public class No709 {

    @Test
    public void test(){
        String str = "HELLO";
        System.out.println(toLowerCase(str));
    }

    public String toLowerCase(String str) {


        return str.toLowerCase();
    }

    // 最快
    public String toLowerCaseFastests(String str) {
        char[] chars = str.toCharArray();
        int dist = 'A'-'a';
        for (int i = 0; i < str.length();i++){
            if( 'A' <= chars[i]&& chars[i] <= 'Z'){
                chars[i] -= dist;
            }
        }
        return new String(chars);
    }

}
