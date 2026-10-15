package ex3;


public class Maison {

    String type;
    String adr;
    int nbchambre;
    float surface;

    public Maison(String adr, String t, int n) {
        this.adr=adr;
        type=t;
        nbchambre=n;
    }
    public Maison(String a, String t, int n, float s) {
        adr=a;
        type=t;
        nbchambre=n;
        surface=s;
    }
    public void setSurface(float s) {
        surface = s;
    }
    public float calculPrix(float pmc) {
        return surface * pmc;
    }
    public float calculPrix() {
        return 2100 * surface;
    }
    public String toChaine() {
        return "un " + type + "de " + surface + "m2 a "
                +adr+ "avec " + nbchambre + " chambres";
    }
    public static void main(String[] args) {
        Maison m1=new Maison("Tunis","duplex",4,210);
        Maison m2=new Maison("Nabeul","villa",5);
        m2.setSurface(230);
        System.out.println("m1:");
        System.out.println("type: " + m1.type);
        System.out.println("adr: " + m1.adr);
        System.out.println("nb chambres: " + m1.nbchambre);
        System.out.println("surface: " + m1.surface + "m2");
        System.out.println("m2 :");
        System.out.println("type: " + m2.type);
        System.out.println("adr: " + m2.adr);
        System.out.println("nb chambres: " + m2.nbchambre);
        System.out.println("surface: " + m2.surface + "m2");
        System.out.println("description:");
        System.out.println(m1.toChaine());
        System.out.println(m2.toChaine());
        System.out.println("Prix de m1 :");
        System.out.println("pmc=2000: " + m1.calculPrix(2000) + "dt");
        System.out.println("pmc fixe: " + m1.calculPrix() + "dt");

        System.out.println("prix de m2 :");
        System.out.println("pmc =2000: "+m2.calculPrix(2000) + "dt");
        System.out.println("pmc fixe: " + m2.calculPrix() + "dt");
    }
}
