public class Test {
    public static void main(String[] args) {
       BudgetLibrary b = new BudgetLibrary();
       Date SDate1 = new Date(25,2,2020);
       Date EDate1 = new Date(25,3,2020);
       Budget budget1 = new Budget("test1",1000,0, SDate1, EDate1, 5);
       Date SDate2 = new Date(25,5,2019);
       Date EDate2 = new Date(25,5,2020);
       Budget budget2 = new Budget("test2",200000,128934, SDate2, EDate2, 5);
       b.addBudget(budget1);
       b.addBudget(budget2);
       b.print();
       b.deleteBudget(budget2);
       b.deleteBudget(budget2);
       b.print();
       EventLibrary e = new EventLibrary();
       Event event1 = new Event(EDate1, "Event1", 3);
       Event event2 = new Event(EDate1, "Event2", 4);
       Event event3 = new Event(EDate2, "Event3", 1);
       Event event4 = new Event(SDate1, "Event4", 2);
       e.addEvent(event1);
       e.addEvent(event3);
       e.addEvent(event2);
       e.addEvent(event4);
       e.print();
       e.deleteEvent(event2);
       e.deleteEvent(event2);
       e.print();

    }
}
