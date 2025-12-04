class ReverseDoublyLinkedList {
    public static class Node{
        int val;
        Node prev, next;
        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node reverseDoublyLinkedList(Node head){
        if(head==null || head.next==null){
            if (head != null) head.prev = null;
            return head;
        }

        Node newHead = reverseDoublyLinkedList(head.next);
        head.next.next = head;
        head.prev = head.next;
        head.next = null;
        newHead.prev = null;
        return newHead;
    }

        static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val);
            if(node.next != null){
                System.out.print(" <-> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        // head.next.next = new Node(3);
        // head.next.next.prev = head.next;

        head = reverseDoublyLinkedList(head);

        printList(head);
    }
}