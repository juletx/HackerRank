

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head == null || head.next == null) {  
            return head;  
        }
        SinglyLinkedListNode remaining = reverse(head.next);
        head.next.next = head;
        head.next = null;  
        return remaining; 
    }

