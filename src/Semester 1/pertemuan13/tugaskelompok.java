import java.util.Scanner;
public class tugaskelompok {
    public static void main(String[] args) {
        String[] pelanggan= new String[10];
        int banyakbeli=0,total=0,menu=0;
        int[] nomor= new int[10];
        String[] banyakmenu ={"","kopi hitam","Latte","Teh tarik","Mie Goreng"}; 
        int[] hargamenu ={0,15000,22000,12000,18000};
        String[][] data1=new String[10][5];
        int[][] jmlh=new int[10][5];
        int[][] harga=new int[10][5];
        int k=0;
        do {
        Scanner sc = new Scanner (System.in);
        System.out.println("===== Menu utama ======");
        System.out.println("1. Tambahkan pesanan");
        System.out.println("2. Tampilkan Daftar Pesanan");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu : ");
        int minu = sc.nextInt();
        sc.nextLine();
        if (minu == 1) {
        System.out.print("Massukan nama pelanggan : ");
        pelanggan[k] = sc.nextLine();
        System.out.print("Massukan nomor meja : ");
        nomor[k] = sc.nextInt();
        System.out.println();
        System.out.println("===== MENU KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Latte - Rp 22000");
        System.out.println("3. Teh Tarik - Rp 12000");
        System.out.println("4. Mie Goreng - Rp 18000");
        k++;
        int j=0;
        do {
            System.out.print("Pilih menu (masukkan nomer menu atau 0 untuk selesai ) : ");
            menu = sc.nextInt();
            if (menu!=0) {
            System.out.print("masukkan jumlah item untuk "+banyakmenu[menu]+" : ");
            banyakbeli = sc.nextInt();
            total+=(hargamenu[menu]*banyakbeli);}
            harga[k][j]=(hargamenu[menu]*banyakbeli);
            data1[k][j]=banyakmenu[menu];
            jmlh[k][j]=banyakbeli;
            j++;
            } while (menu!=0);
        System.out.println("pesanan berhasil di tambahkan");
        System.out.println("total haraga pesanan : Rp "+total);
        System.out.println(k+" "+j);
        }
        if (minu == 2) {
            for (int j = 1; j <= k; j++) {
            int akhir=0;
            System.out.println("====== DAFTAR PESANAN ======");
            System.out.println("nama pelanggan = "+pelanggan[j-1]);
            System.out.println("nomor meja = "+nomor[j-1]);
            System.out.println("Detail Pesanan : ");
            for (int i = 0; i < jmlh.length; i++) {
                if (data1[k][i].equalsIgnoreCase("")) {
                break;
                }else System.out.println(data1[j][i]+" x "+jmlh[j][i]+" = "+harga[j][i]);
                akhir+=harga[j][i];
            }System.out.println("total harga pesanan = "+akhir);
            System.out.println();
            }
        }
        if (minu == 3) {break;}
        } while (true);
    }
}