package Sorting;

public  class SinglyLinkedList{
    private  ListNode head;
    private  static  class ListNode{
        private  int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.println(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(10);
        sll.insertFirst(14);
        sll.insertFirst(34);
        sll.insertFirst(43);
        sll.display();
    }
}