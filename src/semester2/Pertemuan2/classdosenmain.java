package semester2.Pertemuan2;

public class classdosenmain {
    public static void main(String[] args) {
        classdosen dosen1 = new classdosen();
        dosen1.idDosen="1";
        dosen1.nama="dr. budi";
        dosen1.statusAktif=true;
        dosen1.tahunBergabung=2010;
        dosen1.bidangKeahlian="matematika";
        classdosen dosen2 = new classdosen("123", "budi", true, 2010, "informasi");
        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        System.out.println("Informasi Dosen 2:");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        int masaKerja = dosen2.hitungMasaKerja(2024);
        System.out.println("Masa kerja dosen " + dosen2.hitungMasaKerja(2025) + " tahun.");
        dosen2.ubahKeahlian("Data Science");
        System.out.println("Informasi Setelah Perubahan:");
        dosen2.tampilInformasi();
    }
}

