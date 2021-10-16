package linkedlist;

/* Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by
continuously following the next pointer. Internally, pos is used to denote the index of the node
that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false */

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

public class LinkedListCycle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] head = {
            {3,2,0,-4},
            {1, 2},
            {1}
        };
        int[] pos = {1, 0, -1};

        for(int i=0; i<3; i++) {
            ListNode node = createLinkedList(head[i], pos[i]);
            System.out.println(sol.hasCycle(node));
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

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head != null) {
            ListNode slowPointer = head;
            ListNode fastPointer = head.next;
    
            while(!slowPointer.equals(fastPointer) && slowPointer != null && fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }
    
            return slowPointer.equals(fastPointer);
        }
        return false;
    }
}
