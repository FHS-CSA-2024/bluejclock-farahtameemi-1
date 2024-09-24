
public class ClockDisplay12Hour extends ClockDisplay {
    private boolean isAM;

    public ClockDisplay12Hour() {
        super();
        isAM = true; // Default to AM
    }

    public ClockDisplay12Hour(int hour, int minute, boolean am) {
        // Set hour for 12h format, init AM/PM
        super(hour % 12 == 0 ? 12 : hour % 12, minute);
        isAM = am;
    }

    public void timeTick() {
        super.timeTick();
        // Switch AM/PM at 12:00
        if (getHour() == 12 && getMinute() == 0) {
            isAM = !isAM; // Toggle AM/PM
        }
        updateDisplay(); // Refresh display
    }

    @Override
    public void setTime(int hour, int minute) {
        // Set time, adjust for 12h
        super.setTime(hour % 12 == 0 ? 12 : hour % 12, minute);
        isAM = hour < 12; // AM if < 12
        updateDisplay();
    }

    @Override
    public String getTime() {
        // Return time with AM/PM
        return super.getTime() + (isAM ? " AM" : " PM");
    }

    private void updateDisplay() {
        // Call parent to update display
        super.updateDisplay();
    }
    
    // Get current hour from time string
    private int getHour() {
        return Integer.parseInt(super.getTime().split(":")[0]);
    }

    // Get current minute from time string
    private int getMinute() {
        return Integer.parseInt(super.getTime().split(":")[1].split(" ")[0]);
    }
}
