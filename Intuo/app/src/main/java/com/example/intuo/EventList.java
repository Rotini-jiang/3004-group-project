package com.example.intuo;
public class EventList {
    // 没有Event呢还
    private EventNode head;

    public EventList() {
        this.head = null;

    }
    /* //insert First Node
    public void insertHeadNode(Event event) {
        EventNode node = new EventNode(event);
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
 */
    // insert in anywhere
	
	
    public void insert( Event event){
        EventNode temp;
        EventNode current;
        EventNode previous;

        temp = new EventNode(event);
        temp.next = null;

        current = head;
        previous = null;

        while (current!= null){
            if(event.compareDate(current.event)==0){
                if (event.getPriority()>current.event.getPriority()) {
                    break;
                }
            }
            previous = current;
            current = current.next;
        }
        if (previous==null){
            head = temp;
        }
        else{
            previous.next = temp;
        }
        temp.next = current;

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

        EventNode current = head;
        EventNode remove;
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
                EventNode current = head;
                while (current != null) {
                    System.out.println(current);
                    current = current.next;
                }
    }
}
