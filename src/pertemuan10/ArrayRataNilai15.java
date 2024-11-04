package pertemuan10;
import java.util.Scanner;
public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaimhs = new int[10];
        double total = 0;
        double rata2 = 0;
        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaimhs[i] = sc.nextInt();
            total += nilaimhs[i];
            
        }rata2 = total/nilaimhs.length;
        System.out.println("rata rata nilai = "+rata2);
    }
}
