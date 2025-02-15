package pertemuan3;
import java.util.Scanner;
class P3_tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlhKWH, TarifListrik = 1500, totaltagihan;
        System.out.print("masukkan jumlah kwh:");
        jmlhKWH = input.nextInt();
        totaltagihan = jmlhKWH*TarifListrik;
        System.out.println("total tagihan listrik : "+totaltagihan);
        if (jmlhKWH > 500) { System.out.println("melebihi 500");}
        if (jmlhKWH <= 500) { System.out.println("tidak melebihi 500");}

        
       

        
    }
}