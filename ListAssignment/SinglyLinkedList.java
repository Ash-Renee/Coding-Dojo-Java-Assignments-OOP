public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // SLL methods go here below here
    //first method is for adding a node to the SLL
    public void addNode(int value) {
        if(this.head == null) {
            this.head = new Node(value);
        } 
        else {
            Node frogger = head;
            while(frogger.next != null) {
                frogger = frogger.next;
            }
            frogger.next = new Node(value);
        }
    }
    // at this point if I understand everything correctly,
    //this is our loop that does the SLL like we did in the morining algos
    // fromm here we need to set our remove and print functions

    //this next one is so that we can remove nodes
    public void removeNode(){
        if(this.head != null){
            Node frogger = this.head;
            while(frogger.next.next != null){
                frogger = frogger.next;
            }
            frogger.next = null;
        }
    }
    //from here we are going to print the relevant values from the methods above
    public void printValues(){
        if(this.head != null){
            Node frogger = this.head;
            while(frogger != null){  //removed .next from frogger.next
                System.out.println(frogger.value);
                frogger = frogger.next;
            }
        }
    }
    //i think that's everything?  I don't really comprehend what I'm doing TBH
}