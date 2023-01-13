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
        if (day < super.getDay()) {
            return super.getDay() - day;
        }
        if (day > end){
            return end - day;
        }
        else{
            int currDay = super.getDay();
            while (true){
                if (currDay == day){
                    return 0;
                }
                if (day < currDay){
                    return currDay - day;
                }
                currDay += this.getPeriod();
            }
        }
    }
}
