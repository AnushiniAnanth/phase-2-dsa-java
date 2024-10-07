import java.util.*;
public class SinglyLinkedList {
    
    private static class Node{
        int data;
        Node next;
    
    Node( int data){
        this.data=data;
        this.next=null;

    }
    }
    private static Node head;
    private static Node tail;
    private int size;

    public SinglyLinkedList(){
    head=null;
    tail=null;
    size=0;
    }

    public void insertAtEnd(int data){
        Node newNode =new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
    }
    else{
        tail.next=newNode;
        tail=newNode;
    }
    size++;

}

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); 
        list .insertAtEnd(5);
        list .insertAtEnd(10);
        list .insertAtEnd(20);
        list .insertAtEnd(40);
        System.out.println(head);
        System.out.println(head.data);
        System.out.println(tail);
        System.out.println(tail.data);
        System.out.println(list.size);
        


    }   

}
