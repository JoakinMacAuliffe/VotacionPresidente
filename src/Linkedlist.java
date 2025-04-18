public class Linkedlist {
    Node head;

    public class Node{
        //CAMBIAR WEA
        Candidato value;
        Node next;
        Node(Candidato value, Node next){
            this.value = value;
            this.next = next;
        }
        Node(Candidato value){
            this.value = value;
            next = null;
        }

    }

    Linkedlist() {
        head = null;
    }

    void insert(Candidato candidato){

        Node newNode = new Node(candidato);

        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    int getSize(){
        int size = 0;
        Node current = head;
        while(current != null){
            size++;
            current = current.next;
        }
    return size;
    }

}


