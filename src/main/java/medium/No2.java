package medium;

import org.junit.Test;

public class No2 {

    @Test
    public void test() {
//        ListNode node11 = new ListNode(1);
//        ListNode node12 = new ListNode(9);
//        ListNode node13 = new ListNode(9);
//        ListNode node14 = new ListNode(9);
//        ListNode node15 = new ListNode(9);
//        ListNode node16 = new ListNode(9);
//        ListNode node17 = new ListNode(9);
//        ListNode node18 = new ListNode(9);
//        ListNode node19 = new ListNode(9);
//        ListNode node110 = new ListNode(9);
//        ListNode node21 = new ListNode(9);
////        ListNode node22 = new ListNode(6);
////        ListNode node23 = new ListNode(4);
//        node11.next = (node12);
//        node12.next = (node13);
//        node13.next = (node14);
//        node14.next = (node15);
//        node15.next = (node16);
//        node16.next = (node17);
//        node17.next = (node18);
//        node18.next = (node19);
//        node19.next = (node110);
////        node21.next = (node22);
////        node22.next = (node23);
//
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
        node11.next = node12;
        node12.next = node13;
        node21.next = node22;
        node22.next = node23;

        System.out.println(addTwoNumbers(node11, node21));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        Boolean gt10 = false;

        node = pack(node,l1,l2,gt10);
        return  node;
    }

    public ListNode pack(ListNode node , ListNode l1, ListNode l2,Boolean gt10){
        if (l1 != null || l2 != null){

            int x = 0, y = 0;

            if(l1 != null){
                x = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                y = l2.val;
                l2 = l2.next;
            }
            int cell = x + y;

            //先判断上一个数是否要进1
            if(gt10){
                cell += 1;
            }

            if(cell >= 10){
                gt10 = true;

            }else{
                gt10 = false;
            }
            if(gt10){
                cell -= 10;
            }
            node.val = cell;

            ListNode next = new ListNode(0);
            node.next = pack(next,l1,l2,gt10);
            if(l1 == null && l2 == null){
                if(gt10){
                    node.next = new ListNode(1);
                }
            }
            return node;
        }
        return null;
    }

    // 最快
    public ListNode addTwoNumbersFastest(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(0);
        ListNode runner = preHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            runner.next = new ListNode(carry % 10);
            runner = runner.next;
            carry /= 10;
        }
        return preHead.next;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

//        public ListNode() {
//        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
