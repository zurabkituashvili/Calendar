package fop.w7cal;

public class InfiniteRepeatEvent extends Event {
    private int period;

    public InfiniteRepeatEvent(int day, String description, String place, int period) {
        super(day, description, place);
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public int diff(int day){
        return this.getPeriod()%(this.getDay() - day);
    }
}
