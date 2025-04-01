public class Main {
    public static void main(String[] args) {

        // Calculator c = new Calculator();
        AdvancedCalculator ac = new AdvancedCalculator();

        ac.adunare(7);
        ac.inmultire(2);
        ac.inmultire(5);
        ac.radical();

        System.out.println(ac.getRezultat());

    }
}