

public class Budget {
    private String name;
    private float amount;
    private float usage;
    private Date startDate;
    private Date endDate;
    private int priority;

    public Budget(String n, int a, int u, Date s, Date e, int p){
        this.name = n;
        this.amount = a;
        this.usage = u;
        this.startDate = s;
        this. endDate = e;
        this.priority = p;
    }

    // Check if this priority is greater than parameter
    public boolean priorityCompare(int priority) {
        return this.priority >= priority;
    }

    public String getName(){
        return name;
    }

    public float getAmount(){
        return amount;
    }

    public float getUsage(){
        return usage;
    }

    public float restOfBudget(){
        return amount - usage;
    }

    public void thirtyPercentWarning(){
        if (usage >= amount * 0.7) {
            System.out.println("30% percent left");
        }
    }

    public void tenPercentWarning(){
        if (usage >= amount * 0.9) {
            System.out.println("10% percent left");
        }
    }

    public void print(){
        System.out.println("Budget is: name: "+ name + "amount: " + amount + "usage: " + usage + "startDate: " + startDate + "endDate: " + endDate + "priority: " + priority);
    }
}