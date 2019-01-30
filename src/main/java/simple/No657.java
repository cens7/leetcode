package simple;

import org.junit.Test;

public class No657 {

    @Test
    public void test() {


    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        char[] chars = moves.toCharArray();
        for (char c : chars) {
            switch (c) {
                case 'R':
                    x += 1;
                    break;
                case 'L':
                    x -= 1;
                    break;
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
            }
        }
        return (x == 0) && (y == 0);
    }

    private void cse(char ch, int x, int y) {



    }

}
