package simple;

import org.junit.Test;
import sun.security.util.Length;

public class No344 {

    @Test
    public void test(){
        char[] ch = new char[]{'h','e','l','l','o'};
        reverseString(ch);
        System.out.println(ch);
//        System.out.println(reverseString(ch));
    }

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(j>i){
            s[i]= (char)(s[i]^s[j]);
            s[j] = (char)(s[j]^s[i]);
            s[i] = (char)(s[i]^s[j]);
            j--;
            i++;
        }


//        char[] ch = new char[s.length];
//
//        int j = 0;
//        for (int i = s.length-1; i >=0 ; i--) {
//            ch[j++]=s[i];
//
//            a=a^b;
//            b=a^b;
//            a=a^b;
//
//        }
//        return ch;

    }

}
