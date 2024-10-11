package pertemuan7;
import java.util.Scanner;
public class KafeDoWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int teh, roti,kopi,totalharga, hargakopi=12000, hargateh=7000, hargaroti=20000;
    String namaPelanggan;
    do {
    System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): "); 
    namaPelanggan = sc.nextLine();
    if (namaPelanggan.equalsIgnoreCase("batal")) {
        System.out.println("transkasi di batalkan");
        break;
    }
    System.out.print("jmlh kopi = ");
    kopi =sc.nextInt();
    System.out.print("jumlah teh = ");
    teh =sc.nextInt();
    System.out.print("jumlah roti = ");
    roti =sc.nextInt();
    totalharga = (teh*hargateh)+(kopi*hargakopi)+(roti*hargaroti);
    System.out.println("total harus dibayar = rp "+totalharga);
    sc.nextLine();
    }
    while(true);
    System.out.println("semua transaksi selesai");
}
}  
