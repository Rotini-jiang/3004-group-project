package com.example.intuo;
import java.util.*;

public class Notification {

    private EventLibrary eventList;
    private BudgetLibrary budgetList;
    private Vector<String> logs = new Vector<String>();

    //constructor
    public Notification(EventLibrary e, BudgetLibrary b, ) {
        this.eventList = e;
        this.budgetList = b;
    }
    public void sendEventNotification(EventLibrary e){


    }
    public void sendBudgetNotification(BudgetLibrary b){


    }
    public void clearLogs(){
        logs.clear();
    }
    public void updateLogs(){

    }
}