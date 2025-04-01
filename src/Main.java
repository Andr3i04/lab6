public class Main {
    public static void main(String[] args) {

        // Calculator c = new Calculator();
        AdvancedCalculator ac = new AdvancedCalculator();

        ac.adunare(7);
        ac.inmultire(2);
        ac.radical();
        ac.exponent();

        System.out.println(ac.getRezultat());

    }
}