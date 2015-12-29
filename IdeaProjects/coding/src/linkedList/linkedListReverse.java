package linkedList;

import java.util.LinkedHashMap;

/**
 * Created by shishirbhargav on 10/15/15.
 */

class listNode{

    int data;
    listNode next;

    listNode(int x){
        this.data = x;
        this.next = null;
    }
}
public class linkedListReverse {

    public static void main(String[] argv) {

        listNode n1 = new listNode(10);
        listNode n2 = new listNode(20);
        listNode n3 = new listNode(30);
        listNode n4 = new listNode(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        listNode head = n1;

        System.out.println("Before reversing");
        print(head);

        head = reverseList(head);

        System.out.println("After reversing");
        print(head);
    }

    static void print(listNode head){
        listNode temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static listNode reverseList(listNode head){

        if (head == null || head.next == null)
            return head;

        listNode pre = head;
        listNode cur = head.next;

        head.next = null;

        while (pre != null && cur != null){
            listNode next = cur.next;
            cur.next = pre;
            pre = cur;

            if (next != null)
                cur = next;
            else
                break;

        }
        return cur;
    }
}
