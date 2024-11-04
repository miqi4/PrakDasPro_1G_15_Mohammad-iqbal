package pertemuan10;
import java.util.Scanner;
public class Searchnilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Arrnilai = {80,85,78,96,90,82,86};
        int key=90, hasil=0;
        for (int i = 0; i < Arrnilai.length; i++) {
            if (key == Arrnilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.out.println("nilai "+key+" ketemu di indeks ke-"+hasil);
        System.out.println();
    }
}
