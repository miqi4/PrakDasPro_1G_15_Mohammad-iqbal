package pertemuan13;
import java.util.Scanner;
public class P13_Tugas2 {
    static void input(int[][] terjual, String[] menu,int[] hari) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < 7; i++) {
            System.out.print("PENJUALAN HARI ke ");
            hari[i]=sc.nextInt();
        for (int j = 0 ; j < menu.length; j++) {
            System.out.print(menu[j]+" = ");
            terjual[i][j] = sc.nextInt();
        }System.out.println();}
        System.out.print("menu");
        for (int i = 0; i < 7; i++) {
            System.out.print("  Hari "+hari[i]);
        }System.out.println();
    }
    static void tabel(int[][] terjual, String[] menu,int[] hari) {
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i]);
            for (int j = 0; j < terjual.length; j++) {
                System.out.print("   |   "+terjual[j][i]);
            }System.out.println();}}
    static void menuPenjualanTertinggi(int[][] terjual, String[] menu) {
        int maxPenjualan = 0;
        String menuTerlaris = " ";
        for (int i = 0; i < 5; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += terjual[j][i];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }System.out.println("Menu dengan penjualan tertinggi: " + menuTerlaris + " dengan total " + maxPenjualan + " penjualan.");}
    static void rataRataPenjualan(int[][] terjual, String[] menu) {
        System.out.println("Rata-rata penjualan setiap menu:");
        for (int i = 0; i < 5; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += terjual[j][i];
            }
            double rataRata = (double) totalPenjualan / 7;
            System.out.println(menu[i]+" = "+rataRata);
        }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]menu=new String[5];
        int[] hari=new int[7];
        for (int i = 0; i < menu.length; i++) {
            System.out.print("masukkan nama menu "+(i+1)+" : ");
            menu[i] = sc.nextLine();
        }
        int[][]terjual=new int[7][5];
        input(terjual, menu,hari);
        tabel(terjual, menu, hari);
        menuPenjualanTertinggi(terjual, menu);
        rataRataPenjualan(terjual, menu);
    }
}