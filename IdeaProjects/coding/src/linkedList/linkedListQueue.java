package linkedList;

/**
 * Created by shishirbhargav on 10/14/15.
 */

class node{

    int data;
    node next;

    node(int x){
        this.data = x;
        this.next = null;
    }
}

class queue{

    node head;
    node tail;

    public void enqueue(node n){

        if (head == null) {
            head = n;
            tail = head;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public node dequeue(){
        if (head == null)
                return null;
        else{
            node temp = new node(head.data);
            head = head.next;
            return temp;
        }
    }

    public void print(){
        node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class linkedListQueue {

    public static void main(String[] argv){

        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);

        queue q = new queue();
        q.enqueue(n1);
        q.enqueue(n2);
        q.enqueue(n3);
        q.print();

        q.dequeue();
        q.dequeue();
        q.print();

    }
}
