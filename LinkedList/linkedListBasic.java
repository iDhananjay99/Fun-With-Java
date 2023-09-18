package FunWithJava.LinkedList;

class Node{
    int data;
    Node next;
}
public class linkedListBasic {
    Node head;
    Node last;

    void push(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
            last = node;
            node.next = null;
        }
        last.next = node;
        node.next = null;
        last = node;
    }

    void reverse(Node head){
        Node pre = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        this.head = pre;
        while(pre != null){
            System.out.print(pre.data + " ");
            pre = pre.next;
        }

    }
    void display(Node temp){
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        linkedListBasic ll = new linkedListBasic();
        ll.push(1);
        ll.push(2);
        ll.push(3);


        System.out.println("First " + ll.head.data);
        System.out.println("Last: " + ll.last.data);

        ll.reverse(ll.head);
        System.out.println();
        ll.display(ll.head);
    }
}
