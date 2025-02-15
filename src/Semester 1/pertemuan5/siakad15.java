package pertemuan5;
import java.util.Scanner;
public class siakad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        byte Absen;
        double NilaiKuis, NilaiTugas, NilaiAkhir, NilaiUTS, NilaiUAS;
        
        System.out.print("masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("masukkan nim  : ");
        nim = sc.nextLine();
        System.out.print("masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("masukkan absen: ");
        Absen = sc.nextByte();
        System.out.print("Nilai Kuis  : ");
        NilaiKuis = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        NilaiTugas = sc.nextDouble();
        System.out.print("Nilai UTS :");
        NilaiUTS = sc.nextDouble();
        System.out.print("Nilai UAS :");
        NilaiUAS = sc.nextDouble();
        NilaiAkhir = (NilaiKuis*0.2 + NilaiTugas*0.15 + NilaiUTS*0.30 + NilaiUAS*0.35);

        System.out.println("Mahasiswa dengan Nama " +nama+ " NIM " +nim+" Kelas " +kelas+ " Nomor Absen "+Absen);
        System.out.println("Nilai-Akhir :"+NilaiAkhir);

        if (NilaiAkhir>80 && NilaiAkhir<101) {System.out.println("nilai akhir huruf : A");
        System.out.println("kualifikasi : sangat baik ");
        } else if (NilaiAkhir>73 && NilaiAkhir<81) {System.out.println("nilai akhir huruf : B+");
        System.out.println("kualifikasi : lebih dari baik ");
        } else if (NilaiAkhir>65 && NilaiAkhir<74) {System.out.println("nilai akhir huruf : B");
        System.out.println("kualifikasi : baik ");
        } else if (NilaiAkhir>60 && NilaiAkhir<66) {System.out.println("nilai akhir huruf : C+");
        System.out.println("kualifikasi : lebih dari cukup ");
        } else if (NilaiAkhir>50 && NilaiAkhir<61) {System.out.println("nilai akhir huruf : C");
        System.out.println("kualifikasi : cukup ");
        } else if (NilaiAkhir>39 && NilaiAkhir<51) {System.out.println("nilai akhir huruf : D");
        System.out.println("kualifikasi : kurang  ");
        } else if (NilaiAkhir<40) {System.out.println("nilai akhir huruf : E");
        System.out.println("kualifikasi : gagal ");
        }       
    

      
    }
}
