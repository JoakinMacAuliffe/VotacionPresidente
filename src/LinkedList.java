public class LinkedList {

    Node head;

}

class Node{

    int value;
    Node next;

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
    Node(int value){
        this.value = value;
        next = null;
    }

}


