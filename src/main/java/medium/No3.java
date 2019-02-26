package medium;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class No3 {

    @Test
    public void test(){
        String str1 = "abcabcbb";
        String str2 = "bbbbb";
        String str3 = "pwwkew";
        String str4 = "dvdf";
        String str5 = "";
        String str6 = "anviaj";

        System.out.println(lengthOfLongestSubstringFastest(str1));
        System.out.println(lengthOfLongestSubstringFastest(str2));
        System.out.println(lengthOfLongestSubstringFastest(str3));
        System.out.println(lengthOfLongestSubstringFastest(str4));
        System.out.println(lengthOfLongestSubstringFastest(str5));
        System.out.println(lengthOfLongestSubstringFastest(str6));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (null == s)
            return 0;
        int max = 0;
        for (int i = 0, j = i; i < s.length() && j < s.length(); ) {

            int sum = j - i + 1;
            for (j += 1; j < s.length(); ++j) {
                int index = s.substring(i, j).indexOf(s.substring(j, j + 1));

                if (index >= 0) {
                    i += index + 1;
                    break;
                }

                sum++;
            }

            max = Math.max(max, sum);
        }
        return max;
    }

    public int lengthOfLongestSubstringFastest(String s) {
        int n = s.length();
        if (n < 2) return n;
        int[] record = new int[128];
        int left = 0;
        int res = 0;
        for (int right = 0; right < n; right++){
            char cur = s.charAt(right);
            // left更新
            if (record[cur] > left){
                left = record[cur];
            }

            // 记录位置
            record[cur] = right + 1;

            // res更新
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}


