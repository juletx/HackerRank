

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode result = head;
        int index = 0;
        while (current != null){
            current = current.next;
            if (index > positionFromTail){
                result = result.next;
            } 
            index++;  
        }
        return result.data;
    }

