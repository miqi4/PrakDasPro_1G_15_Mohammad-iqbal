package pertemuan13;

public class PengunjungCafe15 {
    public static void daftarpengunjung(String... namapengunjung) {
        System.out.println("daftar nama pengunjung");
        for (String string : namapengunjung) {
            System.out.println("-" + string);
        }
    }
    public static void main(String[] args) {
        daftarpengunjung("ali","budi","citra");
    }
}
