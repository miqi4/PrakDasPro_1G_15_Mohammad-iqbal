package pertemuan10;
import java.util.Scanner;
public class P10_Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hasil=0,rata2=0;
        int m=0;
        System.out.print("masukkan jumlah mahasiswa = ");
        m = sc.nextInt();
        int[] Arrnilai = new int[m];
        for (int j = 0; j < Arrnilai.length; j++) {
            System.out.print("masukkan nilai mahasiswa ke-"+(j+1)+" : ");
            Arrnilai[j] = sc.nextInt();
            hasil+=Arrnilai[j];
            }
            int max =Arrnilai[0];
            int min =Arrnilai[0];
            for (int i = 0; i < Arrnilai.length; i++) {
                if (Arrnilai[i]>max) {
                    max=Arrnilai[i];
                }
                if (Arrnilai[i]<min) {
                    min=Arrnilai[i];
                }
            }
            System.out.println();
            System.out.println("nilai tertinggi "+max);
            System.out.println("nilai terendah "+min);
            System.out.println();
            rata2=hasil/m; 
            System.out.println("rata rata nilai mahasiswa = "+rata2);
            System.out.println();
            for (int i = 0; i < Arrnilai.length; i++) {
                System.out.println("nilai mahasiswa ke "+(i+1)+" = "+Arrnilai[i]);
            }
    }
}
