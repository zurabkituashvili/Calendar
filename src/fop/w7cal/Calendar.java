package fop.w7cal;

public class Calendar {
    EventList events;

    public Calendar() {
        events = null;
    }

    public EventList getEvents() {
        return events;
    }

    public void setEvents(EventList events) {
        this.events = events;
    }

    public void addNewEvent(Event event) {
        EventList curr = events;
        if (events == null) {
            events = new EventList(event);
        } else {
            events = events.add(event);
        }
    }

    public Event[] eventsAt(int day) {
        EventList curr = events;
        int counter = 0;
        int i = 0;
        if (events == null) {
            System.out.println("EventList is empty: ");
            return new Event[0];
        }
        while (curr != null) {
            if (curr.getEvent().diff(day) == 0) {
                counter++;
            }
            curr = curr.getNext();
        }
        Event[] arr = new Event[counter];
        curr = events;
        while (curr != null) {
            if (curr.getEvent().diff(day) == 0) {
                arr[i++] = curr.getEvent();
            }
            curr = curr.getNext();
        }
        return arr;
    }

    public Event nextEvent(int day) {
        if (events == null) {
            return null;
        }
        EventList curr = events;
        int minDiff = Integer.MAX_VALUE;
        Event closestEvent = null;
        while (curr != null) {
            int currDiff = curr.getEvent().diff(day);
            if (currDiff >=0 && currDiff < minDiff){
                closestEvent = curr.getEvent();
                minDiff = currDiff;
            }
            curr = curr.getNext();
        }
        return closestEvent;
    }

    public String toString() {
        EventList curr = events;
        StringBuilder stringBuilder = new StringBuilder();
        if (events == null) {
            System.out.println("Empty Calendar");
            return "";
        } else {
            while (curr != null) {
                stringBuilder.append(curr.getEvent()).append("  ");
                curr = curr.getNext();
            }
        }
        return stringBuilder.toString();
    }
}
