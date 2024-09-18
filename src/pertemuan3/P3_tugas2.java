package pertemuan3;
import java.util.Scanner;
public class P3_tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamKerja, upahKerja, gaji;
        double bonus = 0.1, pajak = 0.05, gajibonus, gajiBonusPajak;
        System.out.print("masukkan jumlah jam kerja : ");
        jamKerja = input.nextInt();
        System.out.print("masukkan upah perjam : ");
        upahKerja = input.nextInt();
        gaji = jamKerja*upahKerja;
        gajibonus = gaji + (gaji*bonus);
        gajiBonusPajak = gajibonus - (gajibonus*pajak);
        System.out.println("total gaji = "+gaji);
        System.out.println("total gaji dan bonus : "+gajibonus);
        System.out.println("total gaji,bonus dan pajak : "+gajiBonusPajak);
        System.out.println("pajak total: "+(gajibonus-gajiBonusPajak));
        System.out.println("bonus gaji : "+(gajibonus-gaji));

    }
    
}
