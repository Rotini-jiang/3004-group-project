public class EventLibrary {
    private EventList listE;
    public EventLibrary(){
        listE = new EventList();
    }
    public void addEvent(Event e){
        listE.add(e);
    }
    public void deleteEvent(Event e){
        listE.delete(e);
    }
    public void print(){
        System.out.println("Event Library: ");
        listE.print();
    }
}
