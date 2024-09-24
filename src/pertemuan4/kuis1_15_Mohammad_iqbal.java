package pertemuan4;
import java.util.Scanner;
public class kuis1_15_Mohammad_iqbal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamSaatIni15, menitSaatIni15, jamKuliah15, menitKuliah15, jkuliah15, mkuliah15;
        System.out.println("nama  : Mohammad Iqbal");
        System.out.println("NIM   : 244107020105");
        System.out.println("Absen : 15");
        System.out.println("==program menghitung jam kuliah==");
        System.out.print("masukkan jam saat ini : ");
        jamSaatIni15 = sc.nextInt();
        System.out.print("masukkan menit saat ini : ");
        menitSaatIni15 = sc.nextInt();
        System.out.println("jam saat ini "+jamSaatIni15+":"+menitSaatIni15);

        System.out.print("masukkan jam masuk kuliah : ");
        jamKuliah15 = sc.nextInt();
        System.out.print("masukkan menit masuk kuliah : ");
        menitKuliah15 = sc.nextInt();
        System.out.println("jam kuliah anda dimulai : "+jamKuliah15+":"+menitKuliah15);

        jkuliah15 = jamKuliah15-jamSaatIni15;
        mkuliah15 = menitKuliah15+(60-menitSaatIni15)-60;

        System.out.print("jam kuliah anda dimulai : "+jkuliah15+" jam "+mkuliah15+" menit");



    }

    
}
