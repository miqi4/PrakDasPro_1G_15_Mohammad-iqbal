package semester2.Pertemuan1;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int jmlMK =0;
        System.out.print("Jumlah Matkul = ");
        jmlMK=input.nextInt();
        input.nextLine();
        String[] MK = new String[jmlMK];
        int[] Nilai = new int[jmlMK];
        String [] NH = new String[jmlMK];
        String [] huruf = {"A","B+","B","C+","C","D","E"};
        double [] BN = new double[jmlMK];
        double [] bobot = {4,3.5,3,2.5,2,1,0};
        double IP = 0;
        double IPK = 0;
        for (int i = 0; i < MK.length; i++) {
            System.out.print("masukkan MK : ");
            MK[i]= input.nextLine();}
        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester ");
        System.out.println("================================");
        for (int i = 0; i < Nilai.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK "+MK[i]+" = ");
            Nilai[i]=input.nextInt();
            input.nextLine();}
        for (int i = 0; i < NH.length; i++) {
            if (Nilai[i]>80 && Nilai[i]<=100) {NH[i]=huruf[0]; BN[i]=bobot[0];}
        else if (Nilai[i]>73 && Nilai[i]<=80) {NH[i]=huruf[1]; BN[i]=bobot[1];}
        else if (Nilai[i]>65 && Nilai[i]<=73) {NH[i]=huruf[2]; BN[i]=bobot[2];}
        else if (Nilai[i]>60 && Nilai[i]<=65) {NH[i]=huruf[3]; BN[i]=bobot[3];}
        else if (Nilai[i]>50 && Nilai[i]<=60) {NH[i]=huruf[4]; BN[i]=bobot[4];}
        else if (Nilai[i]>39 && Nilai[i]<=50) {NH[i]=huruf[5]; BN[i]=bobot[5];}
        else if (Nilai[i]<=39) {NH[i]=huruf[6]; BN[i]=bobot[6];;}}
        System.out.println("================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("================================================");
        System.out.println("MK    Nilai Angka     Nilai Huruf    Bobot Nilai");
        for (int i = 0; i < jmlMK; i++) {
        System.out.println(MK[i]+"       "+Nilai[i]+"             "+NH[i]+"              "+BN[i]);}
        for (int i = 0; i < jmlMK; i++) {
        IP+=BN[i];
        }IPK=IP/jmlMK;
        System.out.println("================================================");
        System.out.println("IP = "+IPK);   }
}
