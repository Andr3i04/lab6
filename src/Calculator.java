public class Calculator {
    protected double rezultat;

    public Calculator() {
        rezultat = 0;
    }

    public Calculator(double x) {
        rezultat = x;
    }

    void adunare(double x) {
        rezultat += x;
    }

    void scadere(double x) {
        rezultat -= x;
    }

    void inmultire(double x) {
        rezultat *= x;
    }

    void impartire(double x) {
        if (x == 0) {
            throw new RuntimeException("Impartire la 0!!!!!");
        } else {
            rezultat /= x;
        }
    }

    public double getRezultat() {
        return rezultat;
    }

}
