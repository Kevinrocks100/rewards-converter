public class RewardValue {
    private double cash;
    private double miles;

    // Constant for miles to cash conversion rate
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Constructor that accepts a miles value
    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cash;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return miles;
    }
}