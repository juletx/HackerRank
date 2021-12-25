    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null){
            return head2;
        }     
        else if (head2 == null){
            return head1;
        }
            
        if(head1.data <= head2.data){
            head1.next = mergeLists(head1.next, head2);
            return head1;
        }
        else{
            head2.next = mergeLists(head1, head2.next);
            return head2;
        }      
    }