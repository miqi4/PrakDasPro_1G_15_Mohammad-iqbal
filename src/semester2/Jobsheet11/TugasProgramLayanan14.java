package semester2.Jobsheet11;
import java.util.Scanner;
public class TugasProgramLayanan14 {
    public static void main(String[] args) {
        TugasAntrianMahasiswa14 antrian = new TugasAntrianMahasiswa14();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== Menu Layanan Kemahasiswaan ===");
            System.out.println("1. Tambah Pasien ke Antrian ");
            System.out.println("2. Layani pasien ");
            System.out.println("3. Cek Apakah Antrian Kosong");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Tampilkan Antrian");
            System.out.println("7. Hitung Jumlah Antrian");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM         : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama        : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas/Prodi : ");
                    String kelas = sc.nextLine();
                    TugasMahasiswa14 mhs = new TugasMahasiswa14 (nim, nama, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Masih ada antrian.");
                    break;
                case 4:
                    antrian.tampilkanAntrianPertama();
                    break;
                case 5:
                    antrian.tampilkanAntrianTerakhir();
                    break;
                case 6:
                    antrian.tampilkanSemuaAntrian();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.hitungJumlahAntrian());
                    break;
                case 8:
                    antrian.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
