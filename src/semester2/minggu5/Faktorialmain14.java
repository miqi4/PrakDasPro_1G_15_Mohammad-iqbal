package semester2.minggu5;
import java.util.Scanner;
public class Faktorialmain14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai = ");
        int nilai = input.nextInt();
    
    Faktorial14 fk = new Faktorial14();
    System.out.println("nilai faktorial "+nilai+" menggunakan BF = "+fk.FaktorialBF(nilai));
    System.out.println("nilai faktorial "+nilai+" menggunakan DC = "+fk.FaktorialDC(nilai));
    }
}
