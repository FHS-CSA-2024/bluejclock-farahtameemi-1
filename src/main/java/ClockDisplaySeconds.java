
public class ClockDisplaySeconds extends ClockDisplay {
    private NumberDisplay seconds; // Secs display

    public ClockDisplaySeconds() {
        super(); // Init parent
        seconds = new NumberDisplay(60); // 60 secs
    }

    public ClockDisplaySeconds(int hour, int minute, int second) {
        super(hour, minute); // Set hr/min
        seconds = new NumberDisplay(60); // 60 secs
        setTime(hour, minute, second); // Set all
    }

    public void timeTick() {
        seconds.increment(); // Tick secs
        if (seconds.getValue() == 0) {
            super.timeTick(); // Tick hr/min if sec wraps
        }
        updateDisplay(); // Refresh display
    }

    public void setTime(int hour, int minute, int second) {
        super.setTime(hour, minute); // Set hr/min
        seconds.setValue(second); // Set secs
        updateDisplay(); // Refresh display
    }

    public String getTime() {
        return super.getTime() + ":" + seconds.getDisplayValue(); // Add secs to time
    }

    private void updateDisplay() {
        // Override to include secs
        super.updateDisplay(); // Keep parent display logic
    }
}
