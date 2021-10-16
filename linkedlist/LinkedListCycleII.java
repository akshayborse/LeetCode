package linkedlist;

import java.util.HashSet;
import java.util.Set;

/***
 * 
 * Given the head of a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached again by
 * continuously following the next pointer. Internally, pos is used to denote the index of the node
 * that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle.
 * Note that pos is not passed as a parameter.
 * 
 * Do not modify the linked list.
 * 
 * */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

}

public class LinkedListCycleII {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[][] head = {
            {3,2,0,-4},
            {1, 2},
            {1}
        };
        int[] pos = {1, 0, -1};

        for(int i=0; i<3; i++) {
            ListNode node = createLinkedList(head[i], pos[i]);
            ListNode ans = sol.detectCycle(node);
            if(ans != null) {
                System.out.println(ans.val);
            } else {
                System.out.println("null");
            }
        }

    }

    private static ListNode createLinkedList(int[] val, int pos) {
        if (val.length > 0) {
            ListNode obj = new ListNode();
            ListNode head = new ListNode();
            ListNode loop = new ListNode();
            for (int i = 0; i < val.length; i++) {
                ListNode node = new ListNode(val[i]);
                if(i == 0) {
                    head = node;
                    obj = node;
                } else {
                    obj.next = node;
                    obj = obj.next;
                }
                if(pos == i) {
                    loop = node;
                }
            }
            obj.next = loop;

            return head;
        }
        return null;
    }
}

class Solution2 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode obj = head;
        if(obj != null) {
            while(!set.contains(obj) && obj.next!=null) {
                set.add(obj);
                obj = obj.next;
            }
            if(obj.next != null) {
                return obj;
            }
            return null;
        }
        return null;
    }
}
