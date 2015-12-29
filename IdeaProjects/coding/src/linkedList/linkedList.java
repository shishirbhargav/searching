package linkedList;

/**
 * Created by shishirbhargav on 10/13/15.
 */

class Node{

    int data;
    Node next;

    Node(int x){
        this.data = x;
        this.next = null;
    }
}

class stack{

    Node top = null;

    public Node pop(){

        if (top == null)
            return null;
        else{
            Node temp = new Node(top.data);
            top = top.next;
            return temp;
        }
    }

    public void push(Node temp){

        if (temp != null){
            temp.next = top;
            top = temp;
        }
    }

    public void print(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class linkedList {

    public static void main(String[] argv){

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        stack s = new stack();
        s.push(n1);
        s.push(n2);
        s.push(n3);
        s.push(n4);
        s.print();

        s.pop();
        s.pop();
        s.pop();

        s.print();

    }
}
