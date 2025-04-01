public class Calculator {
    protected double rezultat;

    public Calculator() {
        rezultat = 0;
    }

    public Calculator(double x){
        rezultat = x;
    }

    public double getRezultat() {
        return rezultat;
    }

    void adunare(double n){
        rezultat +=n;
    }

    void scadere(double n){
        rezultat-=n;
    }

    void inmultire(double n){
        rezultat *=n;
    }

    void impartire(double n){
        if(n==0){
            throw new RuntimeException("Impartire la 0!!!!!");
        }else {
            rezultat /=n;
        }
    }
}
