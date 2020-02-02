package com.example.intuo;
import java.time.LocalDateTime;
public class Date {
    private Time time;
    private int day;
    private int month;
    private int year;
    LocalDateTime local = LocalDateTime.now();              //current local date and time
    public Date(Time t, int d, int m, int y){
        this.time = t;
        this.day = d;
        this.month = m;
        this.year = y;
    }
    //check if the year is a leap year
    public boolean isLeapYear(){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)){
            return true;
        }
        return false;
    }
	public int dateCompare(Date d){
		if(this.year<d.year && this.month<d.month&& this.day<d.day){
		    return 1;
        }
		else if(this.year==d.year && this.month==d.month&& this.day==d.day){
		    return 0;
        }
		else{return -1;}
	}
    //check if the date is equal to the local date
    //@return true: if year, month and day all equal to local date
    public boolean isEqualToLocalDate(){
        return (this.year == local.getYear()&& this.month == local.getMonthValue()&& this.day == local.getDayOfMonth());
    }
    //find the last day of the month, this will be used in other classes to prevent invalid date, such as Feb 30...
    //@return the last day of the month
    public int lastDayOfMonth(){
        switch(this.month){
            case 2:
                if (isLeapYear())  return 29;
                else return 28;
            case 4: case 6: case 9: case 11: return 30;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
        }
        return 0;
    }
    //debugging used method
    public void print(){
        System.out.println("current date is: "+year+"/"+month+"/"+day);
    }
}
