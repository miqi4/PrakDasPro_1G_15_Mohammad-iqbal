package pertemuan6;
import java.util.Scanner;
public class Pemilihan2Percobaan115 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int tahun;
        System.out.print("masukkan tahun : ");
        tahun = input15.nextInt();
        if ((tahun % 4)==0) {
            if ((tahun%100)!=0) 
            System.out.println("tahun kabisat");
        } else System.out.println("bukan tahun kabisat");
    }
}
