

public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue < limit) {
            value = newValue;
        }
    }

    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }

    public void increment() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }
}
