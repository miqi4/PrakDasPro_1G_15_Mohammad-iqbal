package semester2.Jobsheet11;

import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList14 sll = new SingleLinkedList14();
        System.out.print("Masukkan jumlah mahasiswa yang ingin ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
            System.out.println("\nPilih penempatan data:");
            System.out.println("1. Tambah di awal (addFirst)");
            System.out.println("2. Tambah di akhir (addLast)");
            System.out.println("3. Tambah setelah nama tertentu (insertAfter)");
            System.out.println("4. Tambah di posisi tertentu (insertAt)");
            System.out.print("Pilihan: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    sll.addfirst(mhs);
                    break;
                case 2:
                    sll.addLast(mhs);
                    break;
                case 3:
                    System.out.print("Masukkan nama yang dicari: ");
                    String inputNama = sc.nextLine();
                    sll.insertAfter(inputNama, mhs);
                    break;
                case 4:
                    System.out.print("Masukkan index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(idx, mhs);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Data tidak ditambahkan.");
                    break;
            }
        }
        System.out.println("\n== Daftar Mahasiswa ==");
        sll.print();
    }
}
