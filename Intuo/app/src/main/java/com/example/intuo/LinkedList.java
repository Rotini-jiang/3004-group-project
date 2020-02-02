package com.example.intuo;
public class LinkedList {
    // 没有Event呢还
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

    // insert in anywhere
    public void insert( Event event, int index){

        if (head == null) {
            System.out.println("Empty List! ");
            return;
        }
        if (index == 0) {
            insertHeadNode(event); //insert First Node
            return;
        }

        Node node = new Node(event);
        Node current = head;

        for (int j = 0; j < (index - 1) && current != null; j++) {
            current = current.next;
            if (current == null) {
                System.out.println("No such node! ");
                return;
            }
            node.next = current.next;
            current.next = node;
        }
    }
            //delete in anywhere
    public Event delete(int index) {
        if (head == null) {
            System.out.println("Empty list! ");
            return null;
        }
        if (index == 0) {
            return deleteHeadNode();//delete Head Node
        }

        Node current = head;
        Node remove;
        for (int j = 0; j < (index - 1) && current != null; j++) {
            current = current.next;
            if (current == null) {
                System.out.println("No such node! ");
                return null;
            }
        }
        remove = current.next;
        Event event = remove.event;
        current.next = remove.next;
        return event;
    }

            //get size of list
    public int getSize(){
                return size;
    }

            //print out list
    public void print() {
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
