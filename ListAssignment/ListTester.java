public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addNode(3);
        sll.addNode(4);
        sll.addNode(10);
        sll.addNode(5);
        sll.addNode(15);
        sll.addNode(2);
        sll.removeNode();
        sll.removeNode();
        sll.printValues();
    }
}
//ok so if I got this right, it's gonna print the values from lines
//4-7, since the last 2 get removed.  
//How do I use this in the tester??

//so it printed lines 4-6, but not 7, why????