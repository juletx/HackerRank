

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (position == 0){
            return head.next;
        }
        SinglyLinkedListNode current = head;
        for (int i=0; i<position-1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

