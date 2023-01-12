package fop.w7cal;

public class RepeatEvent extends InfiniteRepeatEvent{
    private int end;
    public RepeatEvent(int day, String description, String place, int period, int end) {
        super(day, description, place, period);
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public int diff(int day) {
        if (day < this.getEnd()){
            return this.getPeriod()%(this.getDay() - day);
        }
        int lastEvent = 0;
        for (int i = this.getDay(); i < this.getEnd(); i+=this.getPeriod()){
            lastEvent = i;
        }
        return lastEvent - day;
    }
}
