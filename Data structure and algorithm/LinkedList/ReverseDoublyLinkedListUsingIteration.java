class ReverseDoublyLinkedListUsingIteration{
    static class Node{
        int val;
        Node prev, next;
        public Node(int val){
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    static Node reverseList(Node head){
   if (head == null || head.next == null) {
            return head;
        }

        Node currNode = head;
        Node prevNode = null;

        // Traverse the list and reverse the links
        while (currNode != null) {
          
            // Swap the next and prev pointers
            prevNode = currNode.prev;
            currNode.prev = currNode.next;
            currNode.next = prevNode;

            // Move to the next node in the original list
            // (which is now previous due to reversal)
            currNode = currNode.prev;
        }

        head = prevNode.prev;

        return head;

    }
}