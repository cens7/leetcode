package simple;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class No804 {
    @Test
    public void test() {

    }

    /*

    ["","","","","","","","","","","","","","","","","","","","","","","","","",""]


     */
    public int uniqueMorseRepresentations(String[] words) {

        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuffer sb = new StringBuffer();
            for (String s : word.split("")) {
                sb.append(cse(s));
            }
            set.add(sb.toString());
        }

        return set.size();
    }

    public String cse(String ch){
        switch (ch){
            case "a": return ".-";
            case "b": return "-...";
            case "c": return "-.-.";
            case "d": return "-..";
            case "e": return ".";
            case "f": return "..-.";
            case "g": return "--.";
            case "h": return "....";
            case "i": return "..";
            case "j": return ".---";
            case "k": return "-.-";
            case "l": return ".-..";
            case "m": return "--";
            case "n": return "-.";
            case "o": return "---";
            case "p": return ".--.";
            case "q": return "--.-";
            case "r": return ".-.";
            case "s": return "...";
            case "t": return "-";
            case "u": return "..-";
            case "v": return "...-";
            case "w": return ".--";
            case "x": return "-..-";
            case "y": return "-.--";
            case "z": return "--..";
            default: return "";
        }
    }

    //最快
    public int uniqueMorseRepresentationsFastest(String[] words) {
        int baseIndex = 97;
        Set<String> set = new HashSet<>();
        for (String word : words) {
            int lenght = word.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lenght; i++) {
                sb.append(morse[word.charAt(i) - baseIndex]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
    };


}
