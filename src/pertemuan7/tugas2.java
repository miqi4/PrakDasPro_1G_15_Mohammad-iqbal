package pertemuan7;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,total=0;
        do{
        System.out.print("masukkan jenis kendaraan (1. mobil 2. motor 0. keluar): ");
        jenis = sc.nextInt();
        if (jenis==1 || jenis==2) {
            System.out.print("masukkan durasi = ");
            durasi=sc.nextInt();
            if (durasi>5) {
                total+=12500;
            }
            else if (jenis==1) {
                total+=durasi*3000;
            }
            else if (jenis==2) {
                total+=durasi*2000;
            }
            System.out.println("total = "+total); 
        }continue;
    }while(jenis!=0);
    System.out.print("total akhir = "+total);
    }
}
