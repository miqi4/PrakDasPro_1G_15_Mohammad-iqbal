package pertemuan5;
import java.util.Scanner;
public class tugas15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NamaMakanan;
        double hargatotal,hargaNasiGoreng,hargafuyunghai,hargaMieRebus;
        int NasiGoreng, MieRebus, fuyunghai;

        System.out.print("masukkan nama makanan : ");
        NamaMakanan = sc.nextLine();
        System.out.print("harga nasi goreng : ");
        hargaNasiGoreng = sc.nextDouble();
        System.out.print("jumlah nasi goreng : ");
        NasiGoreng = sc.nextInt();
        System.out.print("harga fuyunghai : ");
        hargafuyunghai = sc.nextDouble();
        System.out.print("jumlah fuyunghai : ");
        fuyunghai = sc.nextInt();
        System.out.print("harga mie rebus : ");
        hargaMieRebus = sc.nextDouble();
        System.out.print("jumlah mie rebus : ");
        MieRebus = sc.nextInt();

        hargatotal = (hargaNasiGoreng*NasiGoreng)+(hargaMieRebus*MieRebus)+(hargafuyunghai*fuyunghai);
        System.out.println("harga sebelum diskon "+hargatotal);
        if (hargatotal>100000 && hargatotal<200001) {System.out.println("total harga makanan setelah diskon "+(hargatotal*0.98));}
        else if (hargatotal>200000 && hargatotal<500001) {System.out.println("total harga makanan setelah diskon "+(hargatotal*0.95));}
        else if (hargatotal>500000) {System.out.println("total harga makanan setelah diskon "+(hargatotal*0.90));}
            
        


    }      
}