class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}
class InsertNthNode{
    public static Node insert(Node head, int pos, int val){
        if(head==null || pos==0){
            Node newHead = new Node(val);
            newHead.next = head;
            return newHead;
        }

        int i=1;
        Node curr = head;

        while(i<pos && curr!=null){
            i++;
            curr= curr.next;
        }

        if(curr==null){
            return head;
        }

        Node temp = curr.next;
        curr.next = new Node(val);
        curr.next.next = temp;

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

        Node newHead = insert(node1, 5, 6);
        print(newHead);


    }
}