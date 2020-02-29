public class EventList {
    private EventNode head;
    private EventNode tail;

    public EventList(){
        head = null;
        tail = null;
    }
    public void add(Event e){
        EventNode newNode = new EventNode(e);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            EventNode temp = head;
            while(true){
                if(newNode.data.compareDate(temp.data) == 1){
                    if(temp == head){
                        head.previous = newNode;
                        newNode.next = head;
                        head = newNode;
                        break;
                    }
                    else{
                        newNode.previous = temp.previous;
                        temp.previous.next = newNode;
                        temp.previous = newNode;
                        newNode.next = temp;
                        break;
                    }

                }
                else if(newNode.data.compareDate(temp.data) == 0){
                    if(newNode.data.priorityCompare(temp.data.getPriority())){
                        if(temp == head){
                            head.previous = newNode;
                            newNode.next = head;
                            head = newNode;
                            break;
                        }
                        else{
                            newNode.previous = temp.previous;
                            temp.previous.next = newNode;
                            temp.previous = newNode;
                            newNode.next = temp;
                            break;
                        }
                    }
                }
                if(temp == tail){
                    tail.next = newNode;
                    newNode.previous = tail;
                    tail = newNode;
                    newNode.next = null;
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void delete(Event e){
        EventNode temp = head;
        if (head.data == e){
            if(tail.data == e){
                head = tail = null;
            }
            else{
                head = head.next;
                head.previous = null;
            }
        }
        else if(tail.data == e){
            tail = tail.previous;
            tail.next = null;
        }
        else{
            while(true){
                if (temp.data == e){
                    temp.previous.next = temp.next;
                    temp.next.previous = temp.previous;
                    break;
                }
                if(temp == tail){
                    System.out.println("Data is not in the list");
                    break;
                }
                else{
                    temp = temp.next;
                }
            }
        }
    }

    public void print(){
        EventNode temp = head;
        while(true){
            if(temp == null){
                break;
            }
            System.out.print("the event name is: '"+temp.data.getName() + "', it will start on ");
            temp.data.getDate().print();
            temp = temp.next;
        }
    }
}
