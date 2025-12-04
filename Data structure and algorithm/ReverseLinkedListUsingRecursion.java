class ReverseLinkedListUsingRecursion{
    Static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node ReverseList(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead = ReverseList(head.next);
        head.next.next=newHead;
        head.next = null;
        return newHead;
    }
}