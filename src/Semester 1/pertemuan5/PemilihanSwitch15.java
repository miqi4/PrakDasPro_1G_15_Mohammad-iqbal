package pertemuan5;
import java.util.Scanner;
public class PemilihanSwitch15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil=0;
        char operator;

        System.out.print("masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("masukkan operator (+ - * :)");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
            hasil = angka1 + angka2;
            break;
            case '-':
            hasil = angka1 - angka2;
            break;
            case '*': 
            hasil = angka1 * angka2;
            break;
            case '/':
            hasil = angka1 / angka2;
            break;
            default :
            System.out.println(" operator yang dipilih tidak sesuai");
        }
        System.out.println(angka1+" "+operator+" "+angka2+" = "+hasil);
        System.out.println(angka1+operator+angka2+" = "+hasil);

    }
    
}
