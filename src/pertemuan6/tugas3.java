package pertemuan6;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        String kategori,merk;
        int ukuran;
        System.out.print("merk : ");
        merk = input15.nextLine();
        System.out.print("kategori : ");
        kategori = input15.nextLine();
        System.out.print("ukuran : ");
        ukuran = input15.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran>40) {System.out.println("tidak ada");}
                    else if (ukuran>35) {
                    System.out.println("harga 800.000");}
                    else System.out.println("tidak ada");}
            if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran>44) {System.out.println("tidak ada");}
                    else if (ukuran>39) {
                    System.out.println("harga 1.200.000");}
                    else System.out.println("tidak ada");}}
        if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran>41) {System.out.println("tidak ada");}
                    else if (ukuran>35) {
                    System.out.println("harga 1.000.000");}
                    else System.out.println("tidak ada");}
            if (kategori.equalsIgnoreCase("man")) {
                if (ukuran>44) {System.out.println("tidak ada");}
                    else if (ukuran>40) {
                    System.out.println("harga 1.800.000");}
                    else System.out.println("tidak ada");}}  
        if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran>40) {System.out.println("tidak ada");}
                    else if (ukuran>35) {
                    System.out.println("harga 750.000");}
                    else System.out.println("tidak ada");}
            if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran>44) {System.out.println("tidak ada");}
                    else if (ukuran>39) {
                    System.out.println("harga 1.500.000");}
                    else System.out.println("tidak ada");}}   
            
            

            
        
    }
}