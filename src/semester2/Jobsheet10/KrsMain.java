package semester2.Jobsheet10;
import java.util.Scanner;
public class KrsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;
        do {
            System.out.println("\n--- Menu Antrian Persetujuan KRS ---");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses 2 Mahasiswa untuk KRS");
            System.out.println("3. Tampilkan Semua Mahasiswa dalam Antrian");
            System.out.println("4. Tampilkan 2 Mahasiswa Terdepan");
            System.out.println("5. Tampilkan Mahasiswa Terakhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Mahasiswa Sudah KRS");
            System.out.println("8. Cetak Jumlah Mahasiswa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Krs14 (nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.dequeue2();
                    break;
                case 3:
                    antrian.printAll();
                    break;
                case 4:
                    antrian.printFront2();
                    break;
                case 5:
                    antrian.printRear();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah sudah KRS: " + antrian.jumlahSudahKRS());
                    break;
                case 8:
                    System.out.println("Jumlah belum KRS: " + antrian.jumlahBelumKRS());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
