package semester2.minggu5;
import java.util.Scanner;
public class summain14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen  : ");
        int elemen = input.nextInt();
        Sum14 sm = new Sum14(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("masukkan keuntungan "+(i+1)+" : ");
            sm.keuntungan[i]=input.nextDouble();
        }
        System. out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System. out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan,0,elemen-1));
    }
}
