package pertemuan5;
import java.util.Scanner;
public class PemilihanHariDenganIf15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayName, dayType;
        System.out.print("input day name : ");
        dayName = sc.nextInt();

        if (dayName>0 && dayName<6) {System.out.println("weekday");}
        else if (dayName>5 && dayName<8) {System.out.println("weekend");} 
        else {System.out.println("invalid number");}
    }
}