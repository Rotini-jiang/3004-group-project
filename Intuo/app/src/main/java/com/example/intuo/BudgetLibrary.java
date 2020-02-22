
package com.example.intuo;

public class BudgetLibrary {

  private BudgetList listB
  
  public void addBudget(Budget b){
    listB.insert(b)
  }
  public void print(){
    System.out.println("Budget Library: ")
    listB.print()
  }
}
