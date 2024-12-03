package pertemuan13;

public class PengunjungCafe15 {
    public static void daftarpengunjung(String... namapengunjung) {
        System.out.println("daftar nama pengunjung");
        for (int i = 0; i < namapengunjung.length; i++) {
            System.out.println("- "+namapengunjung[i]);
            
        }
    }
    public static void main(String[] args) {
        daftarpengunjung("ali","budi","citra");
    }
}
