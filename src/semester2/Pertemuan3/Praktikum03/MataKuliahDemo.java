package semester2.Pertemuan3.Praktikum03;
import java.util.Scanner;
public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jummalh data = ");
        int jumData = sc.nextInt();
        MataKuliah14[] ArrayOfMatakuliah14 = new MataKuliah14[jumData];
        String kode , nama , dummy;
        int JumlahJam,sks;
        for (int i = 0; i < ArrayOfMatakuliah14.length; i++) {
            System.out.println("Input data mata kuliah ke-" + (i + 1));
            ArrayOfMatakuliah14[i] = new MataKuliah14("", "", 0, 0);
            ArrayOfMatakuliah14[i].Tambahdata();
            System.out.println("========================");
            }
        for (int i = 0; i < ArrayOfMatakuliah14.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            ArrayOfMatakuliah14[i].TampilkanData();
        }
    }
}