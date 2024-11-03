package pertemuan10;
import java.util.Scanner;
public class arraynilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiakhir = new int[10];
        for (int i = 0 ; i < 10 ; i++) {
            System.out.print("masukkan nilai akhir ke-"+i+" : ");
            nilaiakhir[i] = sc.nextInt();}
        for (int i = 0; i < 10; i++) {
            System.out.println("nilai akhir ke-"+i+" adalah "+nilaiakhir[i]);
        }
    }
}