package ex1;
public class Calcul {
    public static void main(String[] args) {
        System.out.println("fact =" + Entier.factoriel(6));
        Entier.absolu(-7);
        Entier.comparer(5,2);
        Entier.premier(11);
        Entier e=new Entier();
        System.out.println("fact =" + e.factoriel(5));
        Entier.valeur++;
        System.out.println("val= " + Entier.valeur);
        e.valeur++;
        System.out.println("val= " + Entier.valeur);
    }
}
