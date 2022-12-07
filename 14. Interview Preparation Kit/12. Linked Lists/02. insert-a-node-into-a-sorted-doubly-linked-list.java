

    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        if (head == null) {
            return node;
        }
        else if (data <= head.data) {
            node.next = head;
            head.prev = node;
            return node;
        }
        else {
            DoublyLinkedListNode rest = sortedInsert(head.next, data);
            head.next = rest;
            rest.prev = head;
            return head;
        }
    }

