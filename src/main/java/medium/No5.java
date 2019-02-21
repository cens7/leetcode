package medium;

import org.junit.Test;

public class No5 {

    @Test
    public void test(){
        System.out.println(longestPalindrome("cabad"));
        System.out.println(longestPalindrome("abb"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("abcdbbfcba"));
        System.out.println(longestPalindrome("eabcb"));
    }

    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }

        char[] chars = s.toCharArray();
        int len = chars.length;

        String resultStr = "";
        for (int i = 0; i < len; i++) {

            int loop = len - i;
            int idx = 1;
            for (; loop > 0; loop--) {

                String tmp = new String(chars,i,idx++);
                StringBuffer sb = new StringBuffer(tmp);
                String revStr = sb.reverse().toString();
                if(tmp.equals(revStr) && revStr.length() > resultStr.length()){
                    resultStr = revStr;
                }
            }

        }


        return resultStr;
    }

    // 最快
    public static String longestPalindromeFastest(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; s.length()-i+1>(end-start)/2+1; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                if (len % 2 == 1) {
                    start = i - (len - 1) / 2;
                    end = i + (len - 1) / 2;
                } else {
                    start = i - (len - 1) / 2;
                    end = i + (len - 1) / 2 + 1;
                }

            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int l = left, r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

}
