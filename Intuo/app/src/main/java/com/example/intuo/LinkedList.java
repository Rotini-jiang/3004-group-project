package com.example.intuo;
public class LinkedList {
    // 没有Node呢还
    private Node head;

    public LinkedList() {
        this.head = null;
        
    }
    //insert First Node
    public void insertHeadNode(Event event) {
        Node node = new Node(event);
        node.next = head;
        head = node;
    }

    //delete Head Node
    public Event deleteHeadNode() {
        if (head == null) {
            System.out.println("Empty List! ");
            return null;
        }
        Event event = head.event;
        head = head.next;
        return event;
    }




    public void printLinkedList() {
        System.out.println("Linked List");
        if (head == null) {
            System.out.println("Empty List! ");
        }
        Node current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
