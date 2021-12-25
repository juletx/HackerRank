

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        SinglyLinkedListNode current = head;
        while (current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }       
        }
        return head;
    }

