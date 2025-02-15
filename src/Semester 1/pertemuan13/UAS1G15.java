package pertemuan13;
import java.util.Scanner;
public class UAS1G15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        int input15=0,tinggi15=0;
        int jmlhtim15=10;
        String[] namatim15 = new String[jmlhtim15];
        int[][] skor15= new int[jmlhtim15][2];
        do {
        System.out.println("===== Menu utama ======");
        System.out.println("1. input data skor tim ");
        System.out.println("2. Tampilkan tabel skor dan total skor");
        System.out.println("3. juara turnamen");
        System.out.println("4. keluar");
        System.out.print("Pilih menu : ");
        input15=sc15.nextInt();
        if (input15==1) {  
            System.out.print("masukkan jumlah tim = ");
            jmlhtim15 = sc15.nextInt();
            for (int i = 0; i < jmlhtim15; i++) {
            sc15.nextLine();
            System.out.print("masukkan nama tim "+(i+1)+" ");
            namatim15[i] = sc15.nextLine();
            for (int j = 0; j < 2; j++) {
                System.out.print("masukkan skor level "+(j+1)+" = ");
                skor15[i][j]= sc15.nextInt();
                if (skor15[i][j]<35) {skor15[i][j]=0;}
                else if (skor15[i][j]<0) {
                System.out.println("terjadi kesalahan input ulang skor");
                continue;}
            }
            System.out.println();
        }    
        }
        if (input15==2) {
            System.out.println();
            System.out.println("Tabel skor turnamen");
            System.out.println("nama tim    level 1   level 2   total skor");
            for (int i = 0; i < jmlhtim15; i++) {
                System.out.print(namatim15[i]);
                int tambah=0;
                for (int j = 0; j < 2; j++) {
                    System.out.print("        "+skor15[i][j]);
                    tambah+=skor15[i][j];
                    
                }System.out.print("        "+tambah);
                if (tinggi15<tambah) {
                    tinggi15=tambah;
                }
                System.out.println();
            }System.out.println();
        }
        if (input15==3) {
            System.out.println("juaranya adalah yang memiliki skor"+tinggi15);
        }
        } while (input15!=4);
    }
}
