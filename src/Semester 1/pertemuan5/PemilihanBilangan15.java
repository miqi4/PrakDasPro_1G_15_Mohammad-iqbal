package pertemuan5;
import java.util.Scanner;
public class PemilihanBilangan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan sebuah angka : ");
        int angka = sc.nextInt();
        String hasil;
        hasil = (angka%2 == 0) ? "angka "+angka+" termasuk bilangan genap" : "angka "+angka+" termasuk bilangan ganjil";
        System.out.println(hasil);
        
    }
    
}
