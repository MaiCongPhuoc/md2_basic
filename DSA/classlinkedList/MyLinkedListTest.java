package classlinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
//        ll.printList();
        ll.addFirst(11);
//        ll.printList();
        ll.addFirst(12);
//        ll.printList();
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
