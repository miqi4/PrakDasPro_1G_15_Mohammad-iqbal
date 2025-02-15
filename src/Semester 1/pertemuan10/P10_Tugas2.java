package pertemuan10;
import java.util.Scanner;
public class P10_Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        System.out.print("masukkan jumlah pesanan : ");
        int jmlhpesanan = sc.nextInt();
        sc.nextLine();
        String[] namapesanan = new String[jmlhpesanan];
        int[] hargamakanan = new int[jmlhpesanan];
        for (int i = 0; i < jmlhpesanan; i++) {
            System.out.print("masukkan nama makanan/minuman : ");
            namapesanan[i]=sc.nextLine();
            System.out.print("masukkan harga : ");
            hargamakanan[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.println();
        System.out.println("daftar pesanan");
        for (int i = 0; i < namapesanan.length; i++) {
            System.out.println("- "+namapesanan[i]+" dengan harga "+hargamakanan[i]);
            total+=hargamakanan[i];
        }
        System.out.println("-------------------------");
        System.out.println("total harga "+total);
    }
}
