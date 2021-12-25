    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode nodoBerri = new SinglyLinkedListNode(data);
        
        if(head == null){
            return nodoBerri;
        }  
        else if(position == 0) {
            nodoBerri.next = head;
            return nodoBerri;
        }
    
        SinglyLinkedListNode korri = head;
    
        for(int i=0; i<position-1; i++) {
            korri = korri.next;   
        }
    
        nodoBerri.next = korri.next;
        korri.next = nodoBerri;
    
        return head;
    }