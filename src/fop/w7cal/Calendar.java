package fop.w7cal;

public class Calendar extends EventList{
    public Calendar(Event event) {
        super(event);
    }

    protected Calendar(Event event, EventList next) {
        super(event, next);
    }

    public void addNewEvent(Event event){
        Event thisEvent = new Event(event.getDay(), event.getDescription(), event.getPlace());
        this.add(thisEvent);
    }
}
