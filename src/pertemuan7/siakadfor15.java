package pertemuan7;
import java.util.Scanner;
public class siakadfor15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100, minlulus=60;
        int jmlhlulus=0 ,jmlhtidaklulus=0 ;
        for (int i = 1; i <= 10; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" +i+" : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai; 
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= minlulus) {
                jmlhlulus++;
            } else {
                jmlhtidaklulus++;    
            }}
            System.out.println("nilai tertinggi : "+tertinggi);
            System.out.println("nilai terendah  : "+terendah);
            System.out.println("Jumlah mahasiswa yang lulus : " + jmlhlulus);
            System.out.println("Jumlah mahasiswa yang tidak lulus : " + jmlhtidaklulus);
        
}
}
