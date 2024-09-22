
public class ClockDisplaySeconds extends ClockDisplay {
    private NumberDisplay seconds;

    public ClockDisplaySeconds() {
        super();
        seconds = new NumberDisplay(60);
    }

    public ClockDisplaySeconds(int hour, int minute, int second) {
        super(hour, minute);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }

    public void timeTick() {
        seconds.increment();
        if (seconds.getValue() == 0) {
            super.timeTick();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute, int second) {
        super.setTime(hour, minute);
        seconds.setValue(second);
        updateDisplay();
    }

    public String getTime() {
        return super.getTime() + ":" + seconds.getDisplayValue();
    }

    private void updateDisplay() {
        // Override to include seconds
        super.updateDisplay();
    }
}
