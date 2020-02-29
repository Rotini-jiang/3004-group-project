public class BudgetLibrary {

    private BudgetList listB;
    public BudgetLibrary(){
        listB = new BudgetList();
    }
    public void addBudget(Budget b){
        listB.add(b);
    }
    public void deleteBudget(Budget b){
        listB.delete(b);
    }
    public void print(){
        System.out.println("Budget Library: ");
        listB.print();
    }
}