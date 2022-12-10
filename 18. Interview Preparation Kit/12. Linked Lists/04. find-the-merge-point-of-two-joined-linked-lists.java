

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode current1 = head1;
        SinglyLinkedListNode current2 = head2;

        while (current1 != current2){
            if (current1.next == null){
                current1 = head2;
            }
            else{
                current1 = current1.next;
            }
            if (current2.next == null){
                current2 = head1;
            }
            else{
                current2 = current2.next;
            }
        }
        return current1.data;
    }

