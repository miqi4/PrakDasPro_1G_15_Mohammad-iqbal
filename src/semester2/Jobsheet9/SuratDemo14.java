package semester2.Jobsheet9;
import java.util.Scanner;
public class SuratDemo14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackSurat14 Stack = new StackSurat14(5);
        do {System.out.println("\nMenu:");
            System.out.println("1. Terima surat Izin");
            System.out.println("2. Verifikasi nilai");
            System.out.println("3. Melihat Surat Teratas");
            System.out.println("4. mencari surat ");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String NamaMhs = scan.nextLine();
                    System.out.print("IdSurat: ");
                    String IdSurat = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin: ");
                    char JenisIzin = scan.next().charAt(0);
                    System.out.print("Durasi (dalam hari): ");
                    int Durasi = scan.nextInt();
                    Surat14 mhs = new Surat14(IdSurat, NamaMhs, kelas,JenisIzin,Durasi);
                    Stack.push(mhs);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", mhs.NamaMhs);
                    break;
                case 2:
                    Surat14 verif = Stack.pop();
                    if (verif != null) {System.out.println("surat " + verif.NamaMhs+" telah diverifikasi");
                    } else {System.out.println("Tidak ada surat untuk diproses.");}
                    break;
                case 3:
                    Surat14 lihat = Stack.peek();
                    if (lihat != null) {System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.NamaMhs);
                    } else {System.out.println("Tidak ada surat untuk diproses.");}
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = scan.nextLine();
                    Stack.cariSurat(namaCari);
                    break;
                default: System.out.println("Pilihan tidak valid.");}
        } while (pilih >= 1 && pilih <= 4);
    }
}
