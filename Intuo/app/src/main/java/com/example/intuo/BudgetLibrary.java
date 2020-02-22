
package com.example.intuo;

public class BudgetLibrary {

  private BudgetList listB
  
  public void addBudget(Budget e){
    listB.insert(e)
  }
  public void print(){
    System.out.println("Budget Library: ")
    listB.print()
  }
}
