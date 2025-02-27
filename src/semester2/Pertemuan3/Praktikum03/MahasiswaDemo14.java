package semester2.Pertemuan3.Praktikum03;
import java.util.Scanner;
public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa14[] arrayofMahasiswa = new Mahasiswa14[3];
        String dummy;
        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa[i] = new Mahasiswa14(); 
            System.out.println("masukkan data Mahasiswa Ke "+(i+1));
            System.out.print("NIM = ");
            arrayofMahasiswa[i].nim = input.nextLine();
            System.out.print("Nama =");
            arrayofMahasiswa[i].nama = input.nextLine();
            System.out.print("Kelas = ");
            arrayofMahasiswa[i].kelas = input.nextLine();
            System.out.print("IPK = ");
            dummy = input.nextLine(); 
            arrayofMahasiswa[i].IPK = Float.parseFloat(dummy);
            System.out.println("==========================================");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa Ke "+(i+1));
            arrayofMahasiswa[i].tampilakanInformasi();
        }
        Mahasiswa14[] myarrayofMahasiswa = new Mahasiswa14[3];
        myarrayofMahasiswa[0].nim = "1212121";
        myarrayofMahasiswa[0].nama = "apalah";
        myarrayofMahasiswa[0].kelas = "1";
        myarrayofMahasiswa[0].IPK = (float) 3.8;

    }
}
