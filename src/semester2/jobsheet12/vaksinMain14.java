package semester2.jobsheet12;
import java.util.Scanner;
public class vaksinMain14 {
    public static void main(String[] args)throws
    Exception {
        Scanner sc = new Scanner(System.in);
        vaksin14 vaksin = new vaksin14();
        int input;
        do {
            System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("1. tambah data penerima vaksin ");
        System.out.println("2. hapus data pengantri vaksin ");
        System.out.println("3. daftar penerima vaksin ");
        System.out.println("4. keluar");
        System.out.println("-------------------------------");
        input = sc.nextInt();
        switch (input) {
            case 1:
            System.out.println("masukkan data penerima vaksin");
            System.out.println("-----------------------------");
            System.out.print("nomor antrian : ");
            int nomor = sc.nextInt();
            sc.nextLine();
            System.out.print("Nama penerima vaksin :");
            String nama = sc.nextLine();
            vaksinData14 data = new vaksinData14(nama, nomor);
            vaksin.addLast(data);
            break;
            case 2:
            vaksin.removeFirst();
            System.out.println("antrian terdepan telah di vaksin");
            break;
            case 3:
            vaksin.print();
            break;
            case 4:
            System.out.println("terima kasih");
            break;
            default:
            System.out.println("menu tidak valid coba lagi");
        }
        } while (input!=4);
        
    }
}
