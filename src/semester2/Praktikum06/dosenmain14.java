package semester2.Praktikum06;
import java.util.Scanner;
public class dosenmain14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        datadosen14 list=new datadosen14();
        int j = 5;
        for (int i = 0; i < j; i++) {
            System.out.println("masukkan data dosen ke-"+(i+1));
            System.out.print("masukkan Kode : ");
            String kd = input.nextLine();
            System.out.print("masukkan Nama : ");
            String NM = input.nextLine();
            System.out.print("masukkan jenis kelamin : ");
            String jenis = input.nextLine();
            boolean jk;
            if (jenis.equalsIgnoreCase("pria")) {jk=true;}else{jk=false;}
            System.out.print("masukkan umur : ");
            int u = input.nextInt();
            System.out.println("==================================");
            input.nextLine();
            list.tambah(new dosen14(kd, NM, jk , u));
        }
        list.tampil14();
        System.out.println("----------------------------");
        System.out.println("pencarian data");
        System.out.println("----------------------------");
        System.out.println("masukkan nama dosen yang di cari");
        System.out.print("nama : ");
        String cari = input.nextLine();
        System.out.println();
        System.out.println("menggunakan sequential search");
        list.sequentialSearch14(cari);
        System.out.println("----------------------------");
        System.out.println("pencarian data");
        System.out.println("----------------------------");
        System.out.println("masukkan usia dosen yang di cari");
        System.out.print("usia : ");
        int old = input.nextInt();
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("--------------------------------------------------");
        int posisi2 = list.findBinarySearch14(old, 0, j - 1);
        int pss2 = posisi2;
        list.tampilPosisi14(old, pss2);
        list.tampilDataSearch14(old, pss2);
        
    }
}
