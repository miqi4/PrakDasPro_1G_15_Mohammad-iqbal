package pertemuan11;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] respon = new int[10][6];
        double jumlah = 0, seluruh = 0;
        for (int i = 0; i < respon.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            jumlah = 0; 
            for (int j = 0; j < respon[i].length; j++) {
            System.out.print("Masukkan nilai jawaban ke-" + (j + 1) + " (1-5): ");
            respon[i][j] = sc.nextInt();
            jumlah += respon[i][j];
            }
            double rataResponden = jumlah / respon[i].length;
            System.out.println("Rata-rata nilai jawaban responden ke-" + (i + 1) + " : " + rataResponden);
            seluruh += rataResponden;
        }
        System.out.println();
        System.out.println("Rata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < respon[0].length; j++) {
            double jumlahPertanyaan = 0;
            for (int i = 0; i < respon.length; i++) {
            jumlahPertanyaan += respon[i][j];
            }
            double rataPertanyaan = jumlahPertanyaan / respon.length;
            System.out.println("Rata-rata nilai untuk pertanyaan ke-" + (j + 1) + " : " + rataPertanyaan);
        }
        double rataSeluruh = seluruh / respon.length;
        System.out.println();
        System.out.println("Rata-rata seluruh nilai jawaban responden: " + rataSeluruh);
    }
}