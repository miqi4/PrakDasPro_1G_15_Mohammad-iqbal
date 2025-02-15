package pertemuan11;
import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom,menu;
        String nama,next;
        String[][] penonton = new String[4][2];
        do {
        System.out.println("menu 1 : input data penonton ");
        System.out.println("menu 2 : tampilkan daftar penonton ");
        System.out.println("menu 3 : exit ");
        System.out.print("pilih menu : ");
        menu = sc.nextInt();
        sc.nextLine();
        System.out.println();
        while (menu==1) {
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
        } while (menu==1);
        System.out.println();
        System.out.print("Input penonton lainnya? (y/n): ");
        next = sc.nextLine();
        if (next.equalsIgnoreCase("n")) {
        break;
        }
        }
        while (menu==2) {
        System.out.println();
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j]==null) {
                    penonton[i][j]="***";
                }
                System.out.println(penonton[i][j]+" baris "+(i+1)+" kolom "+(j+1));
            }
        }
        System.out.println();break;
        }
        if (menu==3) {
            break;
        }
    } while (true);
    }
}
