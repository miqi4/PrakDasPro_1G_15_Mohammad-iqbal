package semester2.Pertemuan1;
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        long NIM=0;
        long a=0;
        Scanner input =new Scanner (System.in);
        System.out.print("NIM = ");
        NIM=input.nextLong();
        a=NIM%100;
        if (a<10) {
            a+=10;}
        for (int i = 1; i < a+1; i++) {
            if (i==6||i==10) {
                continue;}
            if (i%2==0) {
                System.out.print(i);
            }else System.out.print("*");   
        }
    }
}
