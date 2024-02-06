import java.util.Arrays;

public class Tablica {

    public static int[] utworzTab() {
        int[] tablica=new int[100];
        for (int i=0;i<100;i++) {
            tablica[i]=i;
        }
        return tablica;
    }

    public static void wyswietlTab(int[] tablica) {
        int licznik=0;
        int[] suma=new int[10];
        Arrays.fill(suma, 0);
        for (int i=0;i<100;i++) {
            if (licznik==10) {
                System.out.println();
                licznik=0;
            }
            suma[i%10]+=tablica[i];
            if (tablica[i]<10) System.out.print("0");
            System.out.print(tablica[i]+" ");
            licznik++;
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print((suma[i]/10)+" ");
        }
    }


    public static void main(String[] args) {
        wyswietlTab(utworzTab());
    }
}
