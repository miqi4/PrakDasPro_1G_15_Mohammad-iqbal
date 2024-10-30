package pertemuan9;
import java.util.Scanner;
public class RataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,j=0;
        float totalnilai,ratanilai=0,nilaimhs;
        while (i<=5) {
            totalnilai=0;
            System.out.println("input nilai mahasiswa ke "+i);
            for (j = 1; j<=5 ; j++) {
                System.out.print("nilai ke-"+j+" = ");
                nilaimhs=sc.nextInt();
                totalnilai+=nilaimhs;
                ratanilai=totalnilai/5;
            }
        System.out.println("rata rata nilai mahasiswa ke-"+i+" adalah "+ratanilai);
        i++;
        }
    }
}
