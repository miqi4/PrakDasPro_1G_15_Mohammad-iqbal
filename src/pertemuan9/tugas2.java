package pertemuan9;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int ke=1;
        do {System.out.print("masukkan nama institusi ke-"+ke+" (masukkan 'keluar' jika ingin keluar) = ");
        nama = sc.nextLine();
        System.out.println();
        if (nama.equalsIgnoreCase("keluar")) {
            break;
        }
        for (int i = 0; i < 4; i++) {
            if (i==0) {
                System.out.println("peserta badminton ");
                for (int j = 1; j <= 5; j++) {
                    System.out.print("masukkan nama peserta ke-"+j+" = ");
                    nama = sc.nextLine();
                }
                System.out.println();
            }
            if (i==1) {
                System.out.println("peserta tenis meja");
                for (int j = 1; j <= 5; j++) {
                    System.out.print("masukkan nama peserta ke-"+j+" = ");
                    nama = sc.nextLine();
                }
                System.out.println();
            }
            if (i==2) {
                System.out.println("peserta volly ");
                for (int j = 1; j <= 5; j++) {
                    System.out.print("masukkan nama peserta ke-"+j+" = ");
                    nama = sc.nextLine();
                }
                System.out.println();
            }
            if (i==3) {
                System.out.println("peserta basket ");
                for (int j = 1; j <= 5; j++) {
                    System.out.print("masukkan nama peserta ke-"+j+" = ");
                    nama = sc.nextLine();
                }
                System.out.println();
            }
        }ke++;
        } while (true);
    }
}
