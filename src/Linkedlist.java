public class Linkedlist {
    Node head;
    public static class Node{
        Candidato value;
        Node next;
        Node(Candidato value){
            this.value = value;
            next = null;
        }
    }

    Linkedlist() {
        head = null;
    }

    void insert(Candidato candidato){
        if(head == null){
            //En el caso de que la lista esté vacía, la ID es 1.
            candidato.setID(1);
            head = new Node(candidato);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            // Asignar ID de tal manera que sea la del candidato anterior + 1
            int newID = current.value.getID() + 1;
            candidato.setID(newID);
            // Añade el candidato a la linkedlist
            current.next = new Node(candidato);
        }
    }

}


