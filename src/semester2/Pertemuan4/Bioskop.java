package semester2.Pertemuan4;
import java.util.Scanner;
public class Bioskop {
    String NamaFilm;
    int JmlKursi;
    int JmlTiket;
    public Bioskop(String namaFilm, int jmlKursi, int jmlTiket) {
        this.NamaFilm = NamaFilm;
        this.JmlKursi = jmlKursi;
        this.JmlTiket = JmlTiket;
    }
    void TampilInfo() {
        System.out.println("Nama Film: " + NamaFilm);
        System.out.println("Jml Kursi: " + JmlKursi);
        System.out.println("Jml Tiket: " + JmlTiket);
        System.out.println("======================================");
    }
    void Tambahdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nama Film yang ditampilkan : ");
        NamaFilm = sc.nextLine();
        System.out.print("masukkan jml kursi : ");
        JmlKursi = sc.nextInt();
        System.out.print("masukkan jml tiket : ");
        JmlTiket = sc.nextInt();
        System.out.println("=============================");
        System.out.println();
    }
}
