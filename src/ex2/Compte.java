package ex2;


public class Compte {
    public int numero;
    private float solde=0;
    private static int c=0;

    public Compte() {
        c=c+1;
        numero=c;
    }
    public void deposer(float m) {
        solde=solde+m;
    }
    public void retirer(float m) {
        solde=solde-m;
    }
    public float avoirSolde() {
        return solde;
    }
    public void transferer(float m, Compte c) {
        retirer(m);
        c.deposer(m);
    }
}
