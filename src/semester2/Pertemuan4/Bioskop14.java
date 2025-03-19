package semester2.Pertemuan4;
public class Bioskop14 {
    public static void main(String[] args) {
        Bioskop[]ArrBioskop = new Bioskop[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Bioskop Ke-" + (i+1));
            ArrBioskop[i] = new Bioskop("",0,0);
            ArrBioskop[i].Tambahdata();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Bioskop Ke-" + (i+1));
            ArrBioskop[i].TampilInfo();
        }
    }
}
