package semester2.Pertemuan2;

public class matakuliahmain14 {
    public static void main(String[] args) {
        matakuliah14 mk1 = new matakuliah14("123","daspro",4,8);
        matakuliah14 mk2 = new matakuliah14("123", "Algoritma", 3, 6);
        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        System.out.println("Informasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangJam(3);
        System.out.println("Informasi Setelah Perubahan:");
        mk2.tampilInformasi();
    }
}
