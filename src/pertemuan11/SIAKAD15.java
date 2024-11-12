package pertemuan11;
import java.util.Scanner;
public class SIAKAD15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int siswa=0, matkul=0;
        System.out.print("masukkan jumlah siswa : ");
        siswa = sc.nextInt();
        System.out.print("masukkan jumlah matkul : ");
        matkul = sc.nextInt();
        int[][] nilai = new int[siswa][matkul];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-"+(i+1));
            double totalpersiswa=0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("nilai mata kuliah "+(j+1)+" : ");
                nilai[i][j]=sc.nextInt();
                totalpersiswa+=nilai[i][j];
            }
        System.out.println("nilai rata rata : "+totalpersiswa/siswa);
        }
        System.out.println();
        for (int j = 0; j < matkul; j++) {
            double totalpermatkul=0;
            for (int i = 0; i < siswa; i++) {
                totalpermatkul+=nilai[i][j];
            }
        System.out.println("mata kuliah "+(j+1)+(" : ")+totalpermatkul/matkul);
        }
    }
}
