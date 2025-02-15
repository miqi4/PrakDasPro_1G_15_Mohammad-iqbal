package pertemuan10;
import java.util.Scanner;
public class Searchnilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=0;
        System.out.print("masukkan jumlah mahasiswa = ");
        m = sc.nextInt();
        int[] Arrnilai = new int[m];
        int key, hasil=0;
        for (int j = 0; j < Arrnilai.length; j++) {
            System.out.print("masukkan nilai mahasiswa ke-"+(j+1)+" : ");
            Arrnilai[j] = sc.nextInt();}
            System.out.print("masukkan nilai yang ingin dicari = ");
            key = sc.nextInt();
            for (int i = 0; i < Arrnilai.length; i++) {
                if (key == Arrnilai[i]) {
                    hasil = i;
                    System.out.println();
                    System.out.println("nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
                    System.out.println();break;}
                if (key != Arrnilai[i] && i==(Arrnilai.length-1)) {
                    System.out.println();
                    System.out.println("nilai yang dicari tidak ditemukan");
                }
        }
    }
}
