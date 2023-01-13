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
        if (events == null){
            events = new EventList(event);
        }
        else{
            events.add(event);
        }
    }

    public Event[] eventsAt(int day){
        EventList curr = events;
        int counter = 0;
        int i = 0;
        if (events == null){
            System.out.println("EventList is empty: ");
            return null;
        }
        while (curr.getEvent() != null) {
            if (curr.getEvent().diff(day) == day) {
                counter++;
            }
            else curr = curr.getNext();
        }
        Event[] arr = new Event[counter];
        EventList newCurr = events;
        while (newCurr.getEvent() != null){
            if (newCurr.getEvent().diff(day) == day){
                arr[i++] = newCurr.getEvent();
            }
            else newCurr = newCurr.getNext();
        }
        return arr;
    }

    public Event nextEvent(int day){
        return null;
    }
}
