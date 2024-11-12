package pertemuan11;
import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama,next;
        String[][] penonton = new String[4][2];
        while (true) {
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        do {
        System.out.print("Masukkan baris: ");
        baris = sc.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = sc.nextInt();
        sc.nextLine();
        if (baris>4||kolom>2) {
            System.out.println("tidak tersedia");
        continue;}
        if (penonton[baris - 1][kolom - 1] != null) {
            System.out.println("Kursi pada baris " + baris + " kolom " + kolom + " sudah terisi. pilih kursi lain.");}
            else {
            penonton[baris - 1][kolom - 1] = nama;
            break;
        }
        } while (true);
        System.out.print("Input penonton lainnya? (y/n): ");
        next = sc.nextLine();
        if (next.equalsIgnoreCase("n")) {
        break;
        }
        }
        System.out.println();
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j]==null) {
                    penonton[i][j]="***";
                }
                System.out.println(penonton[i][j]+" baris "+(i+1)+" kolom "+(j+1));
            }
        }
    }
}
