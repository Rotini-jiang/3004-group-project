public class BudgetNode {

    public Budget data;
    public BudgetNode next;
    public BudgetNode previous;

    public BudgetNode(Budget budget) {
        this.data = budget;
        previous = null;
        next = null;
    }
}