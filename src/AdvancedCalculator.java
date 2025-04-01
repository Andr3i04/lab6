public class AdvancedCalculator extends Calculator {

    public AdvancedCalculator() {

        super();
    }

    public AdvancedCalculator(double x) {
        super(x);
    }

    void radical() {
        if (rezultat < 0) {
            throw new RuntimeException("Nu se poate");
        } else {
            rezultat = Math.sqrt(rezultat);
        }
    }

    void exponent() {
        rezultat = Math.exp(rezultat);
    }

}
