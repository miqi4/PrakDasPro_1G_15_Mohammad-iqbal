package pertemuan6;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3;
        System.out.print("input bil1 : ");
        bil1 = sc.nextInt();
        System.out.print("input bil2 : ");
        bil2 = sc.nextInt();
        System.out.print("input bil3 : ");
        bil3 = sc.nextInt();

        if (bil1>bil2) {
            if (bil1>bil3)
            {System.out.print("bilangan terbesar bil1 : "+bil1);}}
        if (bil2>bil1) {
            if (bil2>bil3) 
            {System.out.print("bilangan terbesar bil2 : "+bil2);}}
        if (bil3>bil1) {
            if (bil3>bil2) 
            {System.out.print("bilangan terbesar bil3 : "+bil3);}}
    }
}
