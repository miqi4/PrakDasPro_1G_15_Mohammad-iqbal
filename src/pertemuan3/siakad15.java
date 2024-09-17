package pertemuan3;
import java.util.Scanner;
public class siakad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        byte Absen;
        double NilaiKuis, NilaiTugas, NilaiUjian, Nilai-Akhir;
        
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
        System.out.print("Nilai Ujian : ");
        NilaiUjian = sc.nextDouble();
        Nilai-Akhir = (NilaiKuis+NilaiTugas+NilaiUjian)/3;
    
       

        System.out.println("Mahasiswa dengan Nama " +nama+ " NIM " +nim+" Kelas " +kelas+ " Nomor Absen "+Absen);
        System.out.println("Nilai-Akhir :"+Nilai-Akhir);

      
    }
}
