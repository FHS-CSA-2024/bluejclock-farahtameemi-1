
public class ClockDriver {
    public static void main(String[] args) {
        // Testing ClockDisplay
        ClockDisplay clock = new ClockDisplay();
        System.out.println("Time: " + clock.getTime());
        clock.setTime(3, 32);
        System.out.println("Time after setting: " + clock.getTime());
        clock.timeTick();
        System.out.println("Time after tick: " + clock.getTime());

        // Testing ClockDisplaySeconds
        ClockDisplaySeconds clockWithSeconds = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Time with seconds: " + clockWithSeconds.getTime());
        clockWithSeconds.timeTick();
        System.out.println("Time after tick: " + clockWithSeconds.getTime());

        // Testing ClockDisplay12Hour
        ClockDisplay12Hour twelveHourClock = new ClockDisplay12Hour(11, 59, false);
        System.out.println("12 Hour Clock: " + twelveHourClock.getTime());
        twelveHourClock.timeTick();
        System.out.println("12 Hour Clock after tick: " + twelveHourClock.getTime());
    }
}

