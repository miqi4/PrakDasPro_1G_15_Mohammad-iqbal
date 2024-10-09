package pertemuan6;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        String buku;
        int jmlhbuku;
        System.out.print("jenis buku : ");
        buku = input15.nextLine();
        System.out.print("jumlah buku : ");
        jmlhbuku = input15.nextInt();
        if (buku.equalsIgnoreCase("kamus")&&jmlhbuku>2) {
            System.out.println("diskon 12%");} 
        else if (buku.equalsIgnoreCase("kamus")&&jmlhbuku<3) {
            System.out.println("diskon 12%");}    
        else if (buku.equalsIgnoreCase("novel")&&jmlhbuku>3) {
            System.out.println("diskon 9%");} 
        else if (buku.equalsIgnoreCase("novel")&&jmlhbuku<4) {
            System.out.println("diskon 8%");}    
        else if (jmlhbuku>3) {
            System.out.println("diskon 5%");}
        else System.out.println("tidak ada diskon");
        }
        
    }
