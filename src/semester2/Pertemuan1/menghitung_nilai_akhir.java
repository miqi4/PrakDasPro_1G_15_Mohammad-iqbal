package semester2.Pertemuan1;
import java.util.Scanner;
public class menghitung_nilai_akhir {
    static int tugas=0;
    static int Kuis=0;
    static int UTS=0;
    static int UAS=0;
    static int nilai=0;
    static void NilaiAkhir(int tugas,int Kuis,int UTS,int UAS) {
        nilai=(tugas*20/100)+(Kuis*20/100)+(UTS*30/100)+(UAS*30/100);
        System.out.println("nilai akhir = "+nilai);}
    static void NilaiHuruf(int nilai) {
        if (nilai>80 && nilai<=100) {System.out.println("nilai huruf = A");}
        else if (nilai>73 && nilai<=80) {System.out.println("nilai huruf = B+");}
        else if (nilai>65 && nilai<=73) {System.out.println("nilai huruf = B");}
        else if (nilai>60 && nilai<=65) {System.out.println("nilai huruf = C+");}
        else if (nilai>50 && nilai<=60) {System.out.println("nilai huruf = C");}
        else if (nilai>39 && nilai<=50) {System.out.println("nilai huruf = D");}
        else if (nilai<=39) {System.out.println("nilai huruf = E");}}
    static void lulus(int nilai) {
        if (nilai>50) {System.out.println("SELAMAT ANDA LULUS");}
        else System.out.println("ANDA TIDAK LULUS");}
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.err.println("Program menghitung nilai akhir ");
        System.out.println("===============================");
        System.err.print("masukkan nilai tugas = ");
        tugas=input.nextInt();
        System.out.print("masukkan nilai kuis = ");
        Kuis=input.nextInt();
        System.err.print("masukkan niali UTS = ");
        UTS=input.nextInt();
        System.out.print("masukkan nilai UAS = ");
        UAS=input.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");
        if (tugas>100||Kuis>100||UTS>100||UAS>100||tugas<0||Kuis<0||UTS<0||UAS<0)
        {System.out.println("nilai tidak valid");}
        else{
        NilaiAkhir(tugas, Kuis, UTS, UAS);
        NilaiHuruf(nilai);
        System.out.println("===============================");
        System.out.println("===============================");
        lulus(nilai);    
        }
    } 
}
