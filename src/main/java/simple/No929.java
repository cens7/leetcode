package simple;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class No929 {

    @Test
    public void test(){
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] sp = email.split("@");
            String prefix = sp[0];
            String suffix = sp[1];
            String s = prefix.replaceAll("\\.", "");
            int idx = s.indexOf("+");
            if( idx != -1){
                s = s.substring(0, idx);
            }
            StringBuffer sb = new StringBuffer();
            set.add(sb.append(s).append("@").append(suffix).toString());
        }

        return set.size();
    }

    //最快
    public int numUniqueEmailsFastest(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String str : emails){
            int n = str.indexOf('@');
            String temp = str.substring(n);
            set.add(temp);
        }

        return set.size();
    }

}
