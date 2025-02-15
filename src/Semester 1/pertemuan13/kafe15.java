package pertemuan13;
import java.util.Scanner;
public class kafe15 {
        public static void Menu(String namapelanggan , String ismember, String kodepromo) {
            System.out.println("selamat datang "+namapelanggan+" !");
            if (ismember.equalsIgnoreCase("iya")) 
            {System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");}
            if (kodepromo.equalsIgnoreCase("diskon50")) {
                System.out.println("anda mendapatkan diskon 50%");
            } else if (kodepromo.equalsIgnoreCase("diskon30")) {
                System.out.println("anda mendapatkan diskon 30%");
            } else {System.out.println("kode invalid");}
            System.out.println("===== MENU RESTO KAFE =====");
            System.out.println("1. Kopi Hitam - Rp 15,000");
            System.out.println("2. Cappuccino - Rp 20,000");
            System.out.println("3. Latte - Rp 22,000");
            System.out.println("4. Teh Tarik - Rp 12,000");
            System.out.println("5. Roti Bakar - Rp 10,000");
            System.out.println("6. Mie Goreng - Rp 18,000");
            System. out. println("===========================");
            System.out.println("Silakan pilih menu yang Anda inginkan.");}
            public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
            int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
            int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
            return hargaTotal;}
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("masukkan nama : ");
                String namaPelanggan = sc.nextLine();
                System.out.print("apakah member (iya/tidak) ?");
                String ismember = sc.nextLine();
                System.out.print("masukkan kode : ");
                String kodepromo = sc.nextLine();
                Menu(namaPelanggan,ismember,kodepromo);
                double totalakhir;
                int totalint;
                int akhir=0;
                do {
                System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
                int pilihanMenu = sc.nextInt();
                System.out.print("Masukkan jumlah item yang ingin dipesan: ");
                int banyakItem = sc.nextInt();
                String menu;
                int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
                double totalhargadouble=totalHarga;
                if (kodepromo.equalsIgnoreCase("diskon50")) {
                totalakhir=totalhargadouble*0.5;
                } else if (kodepromo.equalsIgnoreCase("diskon30")) {
                totalakhir=totalhargadouble*0.7;
                } else {totalakhir=totalHarga;
                System.out.println("kode invalid");}
                if (ismember.equalsIgnoreCase("iya")) {
                totalakhir*=0.9;}
                totalint=(int)totalakhir;
                System.out.println("tambah menu lain ?");
                sc.nextLine();
                menu=sc.nextLine();
                akhir+=totalint;
                if (menu.equalsIgnoreCase("iya")) {continue;}
                System.out.println("Total harga untuk pesanan Anda: Rp" +akhir);
                break;
                } while (true);
    }       
}
