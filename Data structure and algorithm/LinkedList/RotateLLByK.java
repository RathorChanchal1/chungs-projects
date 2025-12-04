class RotateLLByK{
    Static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node rotate(Node head, int k){
        if(head==null || head.next==null){
            return head;
        }
        Node curr = head;
        for(int i=0; i<k; i++){
            if(curr.next==null){
                curr=head;
            }
            if(i=)
            curr = curr.next;
        }
    }
}