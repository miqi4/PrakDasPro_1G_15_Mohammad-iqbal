package semester2.Pertemuan1;
public class Fungsi {
    static int[][]toko={{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
    static int [] harga = {75000,50000,60000,10000};
    static int pengahasilan=0;
    static void pendapatan() {
        int hasil=0;
        for (int i = 0; i < 4 ; i++) {
            int hasiltoko=0;
            for (int j = 0; j < 4; j++) {
            pengahasilan=toko[i][j]*harga[j];
            hasil+=pengahasilan;
            hasiltoko+=pengahasilan;
            }
            System.out.println("cabang "+(i+1)+" hasil = "+hasiltoko);
        }
        System.out.println("hasil seluruh cabang "+hasil);
    }
    static void cabang4() {
            int update=toko[3][0]-1;
            int update1=toko[3][1]-2;
            int update2=toko[3][3]-5;
            System.out.println("perubahan cabang 4 Aglonema = "+update+"  Keladi = "+update1+"  Mawar = "+update2);
    }
    public static void main(String[] args) {
    pendapatan();
    cabang4();
    }
}
