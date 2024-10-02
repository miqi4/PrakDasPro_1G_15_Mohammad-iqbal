package pertemuan5;
import java.util.Scanner;
public class PemilihanOperator15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2;
        char operator;

        System.out.print("masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("masukkan operator (+ - * :) : ");
        operator = sc.next().charAt(0);

        if(operator == '+'){System.out.println(angka1+" "+operator+" "+angka2+" = "+(angka1+angka2));}
        else if (operator == '-') {System.out.println(angka1+" "+operator+" "+angka2+" = "+(angka1-angka2));}
        else if (operator == '*') {System.out.println(angka1+" "+operator+" "+angka2+" = "+(angka1*angka2));}
        else if (operator == ':') {System.out.println(angka1+" "+operator+" "+angka2+" = "+(angka1/angka2));}
        else {System.out.println("operator yang dipilih tidak sesuai");}  
      
    }
}
