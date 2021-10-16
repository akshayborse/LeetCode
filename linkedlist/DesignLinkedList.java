package linkedlist;

/**
 * Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
 * 
 * A node in a singly linked list should have two attributes: val and next. val is the value of the current node,
 * and next is a pointer/reference to the next node.
 * 
 * If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node
 * in the linked list. Assume all nodes in the linked list are 0-indexed.
 * 
 * Implement the MyLinkedList class:
 * 
 * -> MyLinkedList() Initializes the MyLinkedList object.
 * -> int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
 * -> void addAtHead(int val) Add a node of value val before the first element of the linked list.
 *      After the insertion, the new node will be the first node of the linked list.
 * -> void addAtTail(int val) Append a node of value val as the last element of the linked list.
 * -> void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list.
 *      If index equals the length of the linked list, the node will be appended to the end of the linked list.
 *      If index is greater than the length, the node will not be inserted.
 * -> void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 */
public class DesignLinkedList {
    public static void main(String[] args) {
        int val;
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        val = myLinkedList.get(1);              // return 2
        System.out.println(val);
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        val = myLinkedList.get(1);
        System.out.println(val);
    }
}

class MyLinkedList {

    class Node {
        int val;
        Node next;
    }

    Node head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node obj = this.head;
        int i = 0;
        if(obj != null) {
            while(obj != null) {
                if(i == index) {
                    return obj.val;
                }
                obj = obj.next;
                i++;
            }
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node obj = new Node();
        obj.val = val;
        if(this.head == null)  {
            this.head = obj;
        } else {
            obj.next = this.head;
            this.head = obj;
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node obj = new Node();
        obj.val = val;
        Node node = this.head;
        if(node == null) {
            this.head = obj;
        } else {
            while(node.next != null) {
                node = node.next;
            }
            node.next = obj;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node obj = new Node();
        obj.val = val;
        if(index == 0) {
            if(this.head == null) {
                this.head = obj;
            } else {
                obj.next = this.head;
                this.head = obj;
            }
        } else {
            Node node = this.head;
            int i = 0;
                while(node != null) {
                    if(i == index-1) {
                        obj.next = node.next;
                        node.next = obj;
                        break;
                    }
                    node = node.next;
                    i++;
                }
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index == 0) {
            if(this.head != null) {
                this.head = this.head.next;
            }
        } else {
            Node node = this.head;
            int i = 0;
                while(node != null) {
                    if(i == index-1) {
                        if(node.next != null) {
                            node.next = node.next.next;
                            break;
                        }
                    }
                    node = node.next;
                    i++;
                }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
