package ex1;

public class Entier {

    public static int factoriel(int n) {
        int f=1;
        for (int i=1;i<=n;i++) {
            f=f*i;
        }
        return f;
    }
    public static void absolu(int n) {
        if (n<0) {
            System.out.println("val abs= "+(-n));
        } else {
            System.out.println("val abs= " + n);
        }
    }
    public static void comparer(int e1, int e2) {
        if (e1>e2) {
            System.out.println(e1 +" sup a "+ e2);
        } else if (e1 < e2) {
            System.out.println(e1 +" inf a "+ e2);
        } else {
            System.out.println("egaux");
        }
    }
    public static void premier(int n) {
        boolean estPremier=true;

        if (n<2) {
            estPremier=false;
        } else {
            for (int i=2; i<=n /i;i++) {
                if (n%i==0) {
                    estPremier=false;
                }
            }
        }
        if (estPremier) {
            System.out.println(n + " premier");
        } else {
            System.out.println(n + " n'est paspremier");
        }
    }
    public static int valeur=0;
}

