package semester2.Pertemuan3.Praktikum03;
import java.util.Scanner;
public class DosenDemo14 {
    public static void main(String[] args) {
        Dosen14[] arrDosen14 = new Dosen14[3];
        Scanner input = new Scanner(System.in);
        String kode,nama;
        Boolean jenisKelamin;
        int usia;
        for (int i=0; i<3; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            System.out.print("Kode Dosen: ");
            kode = input.nextLine();
            System.out.print("Nama Dosen: ");
            nama = input.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            jenisKelamin = input.next().equalsIgnoreCase("L")? true: false;
            System.out.print("Usia Dosen: ");
            usia = input.nextInt();
            arrDosen14[i] = new Dosen14(kode, nama, jenisKelamin, usia);
            System.out.println();
            input.nextLine();
        }
        for (Dosen14 dosen14 : arrDosen14) {
            dosen14.tampilInformasi();
            System.out.println("==============================");
        }
        Datadosen14 datadosen14 = new Datadosen14();
        datadosen14.dataSemuaDosen(arrDosen14);
        datadosen14.jumlahDosenPerJenisKelamin(arrDosen14);
        datadosen14.rerataUsiaDosenPerJenisKelamin(arrDosen14);
        datadosen14.dosenpalingmuda(arrDosen14);
        datadosen14.dosenpalingtua(arrDosen14);
    }
}
