
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class DeleteNthNode{

    public static Node delete(Node head, int n){
        if(head==null){
            return head;
        }
        if(n==1){
            return head.next;
        }
        int i=1;
        Node curr = head;
        while(i<n-1 && curr!=null){
            curr=curr.next;
            i++;
        }

        if(curr==null || curr.next==null){
            return head;
        }

        curr.next = curr.next.next;
        return head;
    }

    public static void print(Node head){
        if(head==null){
            return;
        }
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node newHead = delete(node1,1);
        print(newHead);
    }
}