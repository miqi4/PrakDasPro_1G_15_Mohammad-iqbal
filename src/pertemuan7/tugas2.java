package pertemuan7;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,totalakhir=0,total=0;
        do{
        System.out.print("masukkan jenis kendaraan (1. mobil 2. motor 0. keluar): ");
        jenis = sc.nextInt();
        if (jenis==1 || jenis==2) {
            System.out.print("masukkan durasi = ");
            durasi=sc.nextInt();
            if (durasi>5) {
                System.out.println("total pembayaran = 12500");
                totalakhir+=12500;
            }
            else if (jenis==1) {
                System.out.println("total pembayaran = "+(durasi*3000));
                totalakhir+=durasi*3000;
            }
            else if (jenis==2) {
                System.out.println("total pembayaran = "+(durasi*2000));
                totalakhir+=durasi*2000;
            }
        }continue;
    }while(jenis!=0);
    System.out.print("total pengahasilan = "+totalakhir);
    }
}
