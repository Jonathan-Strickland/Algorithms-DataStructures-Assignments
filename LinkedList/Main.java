package LinkedList;


public class Main {
    public static void main(String[] args) {
        SingleLinkedListTest sll = new SingleLinkedListTest();
        sll.insertLinkedList(1,0);
        sll.insertLinkedList(2,1);
        sll.insertLinkedList(3,2);
        sll.insertLinkedList(4,3);
        sll.traverseLinkedList();
        sll.searchNode(3);
        sll.deleteNode(3);
        System.out.print("Delete node at location 3\n");
        sll.traverseLinkedList();
    }
}
