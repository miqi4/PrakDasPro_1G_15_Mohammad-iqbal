package pertemuan8;
import java.util.Scanner;

public class UTS15 {
    public static void main(String[] args) {
        
        Scanner iqbal = new Scanner(System.in);
        System.out.println("==== UTS PRAKTIKUM DASAR PEMROGRAMAN TI - 1G ====");
        System.out.println("dibuat oleh : Mohammad Iqbal");
        System.out.println("NIM = 244107020105");
        System.out.println("=================================================");
        
        System.out.println("=================================================");

        String data15,menu215,alamat15,nama15;
        int menu15,golongan15,masakerja15,hadir15,noHP15;
        double gajipokok=0,tunjangan=0,gajiTotal=0;
    
        do{
        System.out.println("pilih menu : ");
        System.out.println("1. Data karyawan");
        System.out.println("2. Gaji karyawan");
        System.out.print("pilih menu : ");
        menu15 = iqbal.nextInt();
        iqbal.nextLine();
        if (menu15==1) {
            System.out.println("masukkan data karyawan");
            System.out.print("nama : ");
            nama15=iqbal.nextLine();
            System.out.print("alamat : ");
            alamat15=iqbal.nextLine();
            System.out.print("noHP : ");
            noHP15=iqbal.nextInt();
            System.out.print("golongan (1/2/3): ");
            golongan15 = iqbal.nextInt();
            System.out.print("masa kerja : ");
            masakerja15 = iqbal.nextInt();
            System.out.print("jumlah kehadiran : ");
            hadir15 = iqbal.nextInt();
            System.out.println("pilih menu : ");
            System.out.println("1. Data karyawan");
            System.out.println("2. Gaji karyawan");
            menu15 = iqbal.nextInt();
            iqbal.nextLine();
            if (menu15 ==1 ) {
                continue;
            }
            if (menu15 == 2) {
                if (golongan15 == 1) {
                    System.out.println("Gaji pokok 2.000.000");
                    gajipokok = 2000000;
                } else if (golongan15 == 2) {
                    System.out.println("Gaji pokok 2.500.000");
                    gajipokok = 2500000;
                } else if (golongan15 == 3) {
                    System.out.println("Gaji pokok 3.000.000");
                    gajipokok = 3000000;
                }
            
                if (masakerja15 < 1) {
                    System.out.println("Tidak ada tunjangan");
                    tunjangan = 0;
                } else if (masakerja15 >= 1 && masakerja15 <= 5) {
                    System.out.println("Tunjangan 10% gaji");
                    tunjangan = 0.1;
                } else if (masakerja15 >= 6 && masakerja15 <= 8) {
                    System.out.println("Tunjangan 20% gaji");
                    tunjangan = 0.2;
                } else if (masakerja15 > 8) {
                    System.out.println("Tunjangan 25% gaji");
                    tunjangan = 0.25;
                }
                gajiTotal = gajipokok + (gajipokok * tunjangan);
                System.out.println("Gaji yang diterima: " + gajiTotal);
            }
            
        }
        else if (menu15==2) { 
            System.out.println("masukkan data karyawan terlebih dahulu");
            System.out.print("kembali ke menu ? : {y/t}");
            menu215 = iqbal.nextLine(); 
            if (menu215.equalsIgnoreCase("y")); 
            else if (menu215.equalsIgnoreCase("t")) {
             System.out.println("selesai");   
            break;} 
            }
        }while(true);
       } 
    
    }
