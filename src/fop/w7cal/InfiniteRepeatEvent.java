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
        if (day <= super.getDay()){
            return super.getDay() - day;
        }else {
            int currDay = super.getDay();
            while (true){
                if (currDay == day){
                    return 0;
                }
                if (day < currDay){
                    return currDay - day;
                }
                currDay += this.period;
            }
        }
    }
}
