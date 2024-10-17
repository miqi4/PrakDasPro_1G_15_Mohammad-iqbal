package pertemuan7;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double harga=50000, total=0, totalhasil=0;
        int jmlhtiket,totaltiket=0;
       
             do {System.out.print("jmlh tiket = ");
            jmlhtiket =sc.nextInt();
            sc.nextLine();
            if (jmlhtiket>4) {
                
                total = (jmlhtiket*harga*0.90);}
            else if (jmlhtiket>10) {
            
                total = (jmlhtiket*harga*0.85);}
            else if (jmlhtiket<0) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;}
            else total = (jmlhtiket*harga);
            System.out.println("total pembayaran = "+total);
            totalhasil+=total;
            totaltiket+=jmlhtiket;}
            while(jmlhtiket>0 || jmlhtiket<0);
            System.out.println("------------------------------------");
            System.out.println("jumlah total penghasilan "+totalhasil);
            System.out.println("jmlh total tiket terjual "+totaltiket);
    }
    
}
