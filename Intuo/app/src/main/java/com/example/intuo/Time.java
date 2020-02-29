public class Time {
    private int second;
    private int minute;
    private int hour;
    //constructor
    public Time(int s, int m, int h){
        this.second = s;
        this.minute = m;
        this.hour = h;
    }
    //convert time to second in order to compare the time
    public int convertToSecond(){
        return hour*3600+minute*60+second;
    }
    //compare two time, return true if they are equal
    public boolean isEqual(Time t){
        return (convertToSecond() == t.convertToSecond());
    }
    //debugging used method
    public void print(){
        System.out.println("Current time is: "+ hour +":"+minute+""+minute);
    }
}

