package pertemuan3;
import java.util.Scanner;

public class Siakad15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nama, nim;
    char Kelas;
    byte Absen;
    
    System.out.print("masukkan nama : ");
    nama = sc.nextLine();
    System.out.print("masukkan nim  : ");
    nim = sc.nextLine();
    System.out.print("masukkan kelas: ");
    Kelas = sc.nextLine().charAt(0);
    System.out.print("masukkan absen: ");
    Absen = sc.nextByte();
    
    
}
}