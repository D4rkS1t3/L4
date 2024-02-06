import java.util.Arrays;
import java.util.Random;

public class Tablica2d {

    public static int[][] utworzTablice2d() {
        Random rnd = new Random();
        int wielkosc = rnd.nextInt(11) + 10;
        int wartosc = 0;
        int[][] tablica = new int[wielkosc][wielkosc];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if (i == j) {
                    wartosc = rnd.nextBoolean() ? 1 : -1;
                } else {
                    wartosc = rnd.nextInt(41) - 20;
                }
                ;
                tablica[i][j] = wartosc;
            }
        }
        return tablica;
    }

    //parzyste wiersze/nieparzyste kolumny
    public static double stosunek(int[][] tablica) {
        double wynik = 0;
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if (j % 2 == 0) {
                    suma1 += tablica[i][j];
                }
                if (i % 2 == 1) {
                    suma2 += tablica[i][j];
                }
            }
        }
        wynik=(double)suma1/suma2;
        System.out.println("Stosunek wynosi:"+wynik);
        return wynik;
    }

    public static void wyswietl2d(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] tab=utworzTablice2d();
        Tablica2d.wyswietl2d(tab);
        stosunek(tab);

    }
}
