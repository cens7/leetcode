package simple;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class No118 {

    @Test
    public void test() {
        List<List<Integer>> generate = generate(6);
        System.out.println(generate);
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> li = new LinkedList<>();
            for (int j = 0; j < numRows; j++) {

                if (j == i) {
                    li.add(1);
                    break;
                }
                if (j == 0) {
                    li.add(1);
                    continue;
                }

                li.add(list.get(i-1).get(j - 1) + list.get(i-1).get(j));
            }
            list.add(li);

        }

        return list;

    }

}
