package com.example.intuo;
public class BudgetList {
    // 没有Budget呢还
    private BudgetNode head;

    public BudgetList() {
        this.head = null;

    }
    //insert First Node
    public void insertHeadNode(Budget budget) {
        BudgetNode node = new BudgetNode(budget);
        node.next = head;
        head = node;
    }

    //delete Head Node
    public Budget deleteHeadNode() {
        if (head == null) {
            System.out.println("Empty List! ");
            return null;
        }
        Budget budget = head.budget;
        head = head.next;
        return budget;
    }

    // insert in anywhere
    public void insert(Budget budget){
        BudgetNode temp;
        BudgetNode current;
        BudgetNode previous;

        temp = new BudgetNode(budget);
        temp.next = null;

        current = head;
        previous = null;

        while (current!= null){
            if(budget.compareDate(current.budget)==0){
                if (budget.getPriority()>current.budget.getPriority()) {
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
    public Budget delete(int index) {
        if (head == null) {
            System.out.println("Empty list! ");
            return null;
        }
        if (index == 0) {
            return deleteHeadNode();//delete Head Node
        }

        BudgetNode current = head;
        BudgetNode remove;
        for (int j = 0; j < (index - 1) && current != null; j++) {
            current = current.next;
            if (current == null) {
                System.out.println("No such node! ");
                return null;
            }
        }
        remove = current.next;
        Budget budget = remove.budget;
        current.next = remove.next;
        return budget;
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
        BudgetNode current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
