package ex2;

public class Banque {

    public static void main(String[] args) {

        Compte co1=new Compte();
        Compte co2=new Compte();
        System.out.println("co1 :");
        System.out.println("num : " +co1.numero);
        System.out.println("solde : "+ co1.avoirSolde() +"dt");
        System.out.println("co2 :");
        System.out.println("num : " +co2.numero);
        System.out.println("solde : " +co2.avoirSolde() + "dt");
        co1.deposer(1200);
        co2.deposer(500);
        System.out.println("apres:");
        System.out.println("solde co1 : "+co1.avoirSolde() + "dt");
        System.out.println("solde co2 : "+co2.avoirSolde() + "dt");
        co2.transferer(700,co1);
        System.out.println("apres transf:");
        System.out.println("solde co1 : " +co1.avoirSolde() + "dt");
        System.out.println("solde co2 : " +co2.avoirSolde() + "dt");
        if (co1.avoirSolde() <0) {
            System.out.println("co1 en rouge : " +co1.avoirSolde() + "dt");
        }
        if (co2.avoirSolde() <0) {
            System.out.println("co2 en rouge : " +co2.avoirSolde() + "dt");
        }
    }
}

