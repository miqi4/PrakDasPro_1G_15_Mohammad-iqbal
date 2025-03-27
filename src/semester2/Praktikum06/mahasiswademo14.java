package semester2.Praktikum06;
import java.util.Scanner;
public class mahasiswademo14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah mahasiswa : ");
        int j = input.nextInt();
        input.nextLine();
        mahasiswaBerprestasi14 list = new mahasiswaBerprestasi14(j);
        for (int i = 0; i < j; i++) {
            System.out.println("masukkan data mahasiswa ke-"+(i+1));
            System.out.print("masukkan NIM : ");
            String NIM = input.nextLine();
            System.out.print("masukkan Nama : ");
            String nama = input.nextLine();
            System.out.print("masukkan kelas : ");
            String kelas = input.nextLine();
            System.out.print("masukkan IPK : ");
            double ipk = input.nextDouble();
            System.out.println("==================================");
            input.nextLine();
            list.tambah(new mahasiswa14(NIM,nama,kelas,ipk));
        }
        list.tampil();
        System.out.println("----------------------------");
        System.out.println("pencarian data");
        System.out.println("----------------------------");
        System.out.println("masukkan ipk mahasiswa yang di cari");
        System.out.print("IPK : ");
        double cari = input.nextDouble();
        System.out.println();
        System.out.println("menggunakan sequential search");
        double posisi =list.sequentialSearch(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("--------------------------------------------------");
        list.bubblesort();
        list.tampil();
        double posisi2 = list.findBinarySearch(cari, 0, j - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
