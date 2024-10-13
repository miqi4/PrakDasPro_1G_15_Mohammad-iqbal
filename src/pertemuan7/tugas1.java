package pertemuan7;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        double harga=50000, total=0, totalhasil=0;
        int jmlhtiket,totaltiket=0;
        do {System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): "); 
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transkasi selesai");
                break;}
            System.out.print("jmlh tiket = ");
            jmlhtiket =sc.nextInt();
            sc.nextLine();
            if (jmlhtiket>3) {
                harga=harga-(harga*0.1);
                total = (jmlhtiket*harga);}
            else if (jmlhtiket>10) {
                harga=harga-(harga*0.15);}
            else if (jmlhtiket<0) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;}
            else total = (jmlhtiket*harga);
            System.out.println("total pembayaran = "+total);
            totalhasil+=total;
            totaltiket+=jmlhtiket;}
            while(true);
            System.out.println("------------------------------------");
            System.out.println("jumlah total penghasilan "+totalhasil);
            System.out.println("jmlh total tiket terjual "+totaltiket);
    }
    
}
