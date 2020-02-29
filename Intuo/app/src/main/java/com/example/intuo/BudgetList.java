public class BudgetList {
    private BudgetNode head;
    private BudgetNode tail;

    public BudgetList() {
        head = null;
        tail = null;
    }
    public void add(Budget b){
        BudgetNode newNode = new BudgetNode(b);
        if(head == null){
            tail = newNode;
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            newNode.next = null;
        }
    }

    public void delete(Budget b){
        BudgetNode temp = head;
        if (head.data == b){
            if(tail.data == b){
                head = tail = null;
            }
            else{
                head = head.next;
                head.previous = null;
            }
        }
        else if(tail.data == b){
            tail = tail.previous;
            tail.next = null;
        }
        else{
            while(true){
                if (temp.data == b){
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
        BudgetNode temp = head;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println("the budget name is: '"+temp.data.getName() + "', with amount of "+temp.data.getAmount()+", and the current usage is "+temp.data.getUsage()+", the remaining budget is "+temp.data.restOfBudget()+".");
            temp = temp.next;
        }
    }
}
