package fop.w7cal;

public class Calendar {
    EventList events;

    public EventList getEvents() {
        return events;
    }

    public void setEvents(EventList events) {
        this.events = events;
    }

    public Calendar(EventList events) {
        this.events = null;
    }

    public void addNewEvent(Event event){
        EventList curr = events;
        if (events.getEvent() == null){
            events.add(event);
        }
        else{
            while (curr != null){
                curr = curr.getNext();
            }
        }
        curr.add(event);
    }

    public Event[] eventsAt(int day){
        return null;
    }

    public Event nextEvent(int day){
        return null;
    }
}
