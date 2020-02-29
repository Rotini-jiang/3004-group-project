public class EventNode {

    public Event data;
    public EventNode next;
    public EventNode previous;

    public EventNode(Event event) {
        this.data = event;
        previous = null;
        next = null;
    }
}