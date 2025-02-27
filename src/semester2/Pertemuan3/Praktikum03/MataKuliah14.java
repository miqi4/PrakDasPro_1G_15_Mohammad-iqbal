package semester2.Pertemuan3.Praktikum03;
import java.util.Scanner;
public class MataKuliah14 {
    public String kode;
    public String nama;
    public String dummy ;
    public int JumlahJam;
    public int sks;
    Scanner sc = new Scanner(System.in);
    public MataKuliah14(String kode, String nama, int jumlahJam, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.JumlahJam = jumlahJam;
        this.sks = sks;}
    void Tambahdata(){
        System.out.print("Kode Mata Kuliah : ");
            kode = sc.nextLine();
            System.out.print("Nama Mata Kuliah : ");
            nama = sc.nextLine();
            System.out.print("SKS              : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam       : ");
            dummy = sc.nextLine();
            JumlahJam = Integer.parseInt(dummy);}
    void TampilkanData(){
        System.out.println("Kode Mata Kuliah : " + kode);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam       : " + JumlahJam);
        System.out.println("-------------------------");}}