package semester2.minggu5;
import java.util.Scanner;
public class pangkatmain14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen = ");
        int elemen = input.nextInt();
        pangkat14[] png = new pangkat14[elemen];
        for(int i=0;i<elemen;i++){
            System.out.print("Masukan nilai basis elemen ke-"+(i+1)+": ");
            int basis = input.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = input.nextInt();
            png[i] = new pangkat14(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE : ");
        for (pangkat14 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+" : "+p.PangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVEDE AND CONQUER : ");
        for (pangkat14 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+" : "+p.PangkatDC(p.nilai, p.pangkat));
        }
    }
}
