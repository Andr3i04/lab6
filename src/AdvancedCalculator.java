public class AdvancedCalculator extends Calculator {

    public AdvancedCalculator() {

        super();
    }

    public AdvancedCalculator(double x) {
        super(x);
    }

    void radical() {
        rezultat = Math.sqrt(rezultat);
    }

    void exponent() {
        rezultat = Math.exp(rezultat);
    }

}
