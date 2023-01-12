public class LimitExeption extends Exception{
    private double remainingAmount;

    public LimitExeption(String message, double remainingAmount) {
        super(message);

    }

    public double getRemainingAmount() {
        return remainingAmount;

    }


}
