
public class ClockDisplay12Hour extends ClockDisplay {
    private boolean isAM;

    public ClockDisplay12Hour() {
        super();
        isAM = true;
    }

    public ClockDisplay12Hour(int hour, int minute, boolean am) {
        super(hour % 12 == 0 ? 12 : hour % 12, minute);
        isAM = am;
    }

    public void timeTick() {
        super.timeTick();
        if (getHour() == 12 && getMinute() == 0) {
            isAM = !isAM;
        }
        updateDisplay();
    }

    @Override
    public void setTime(int hour, int minute) {
        super.setTime(hour % 12 == 0 ? 12 : hour % 12, minute);
        isAM = hour < 12;
        updateDisplay();
    }

    @Override
    public String getTime() {
        return super.getTime() + (isAM ? " AM" : " PM");
    }

    private void updateDisplay() {
        // Override to handle AM/PM
        super.updateDisplay();
    }
}
