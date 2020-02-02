package com.example.intuo;

public class Event {
    private Date date;
    private String name;
    private int priority;

    public Event(Date d, String n, int p){
        this.date = d;
        this.name = n;
        this.priority = p;
    }

    // Check if this priority is greater than parameter
    public boolean priorityCompare(int priority) {
        return this.priority >= priority;
    }
	public int compareDate(Event e){
		return (this.date.dateCompare(e.date));
	}
	public int getPriority(){
        return this.priority;
    }

    public void print(){
        System.out.println("Event is: Date: "+ date + "name: " + name + "priority: " + priority);
    }
}