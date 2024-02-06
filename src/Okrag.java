import java.util.Random;

public class Okrag {

    private double x;
    private double y;
    private double r;

    Random rdm =new Random();

    public Okrag() {
        this.x=Math.round((rdm.nextDouble(91)+5)*100.0)/100.0;
        this.y=Math.round((rdm.nextDouble(91)+5)*100.0)/100.0;
        this.r=Math.round((rdm.nextDouble(5)+1)*100.0)/100.0;
    }

    public static Okrag[] utworzTabOkregow(int n) {
        Okrag[] tablica=new Okrag[n];
        for (int i = 0; i < n; i++) {
            tablica[i]=new Okrag();
        }
        return tablica;
    }

    public static void sprawdzOkregi(Okrag o1, Okrag o2) {
        double odleglosc = Math.sqrt(Math.pow(o2.x - o1.x, 2) + Math.pow(o2.y - o1.y, 2));
        double sumaPromieni = o1.r + o2.r;
        double roznicaPromieni = Math.abs(o1.r - o2.r);

        if (odleglosc > sumaPromieni) {
            System.out.println("Okręgi są rozłączne zewnętrznie.");
        } else if (odleglosc < roznicaPromieni) {
            System.out.println("Okręgi są rozłączne wewnętrznie.");
        } else if (odleglosc == sumaPromieni) {
            System.out.println("Okręgi są styczne zewnętrznie.");
        } else if (odleglosc == roznicaPromieni) {
            System.out.println("Okręgi są styczne wewnętrznie.");
        } else if (odleglosc == 0 && o1.r == o2.r) {
            System.out.println("Okręgi się pokrywają.");
        } else {
            System.out.println("Okręgi się przecinają.");
        }
    }

    @Override
    public String toString() {
        return "Okrag{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }

    public static void wyswietlOkregi(Okrag[] okregi) {
        for (Okrag o:okregi) {
            System.out.println(o.toString());
        }

    }

    public static void main(String[] args) {

        Okrag[] tablicaOkregow =Okrag.utworzTabOkregow(10);
        Okrag.wyswietlOkregi(tablicaOkregow);
    }


}
