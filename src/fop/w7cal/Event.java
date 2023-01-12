package fop.w7cal;

public class Event {
    private int day;
    private String description, place;

    public Event(int day, String description, String place) {
        this.day = day;
        this.description = description;
        this.place = place;
    }

    public int getDay() {
        return day;
    }

    public String getDescription() {
        return description;
    }

    public String getPlace() {
        return place;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int diff(int day) {
        return this.day - day;
    }
}
