package semester2.Pertemuan3.Praktikum03;

public class Dosen14 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;
    public Dosen14(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
        }
        public void tampilInformasi() {
            System.out.println("Kode Dosen : " + kode);
            System.out.println("Nama Dosen : " + nama);
            System.out.println("Jenis Kelamin : " + (jenisKelamin? "Laki-Laki" : "Perempuan"));
            System.out.println("Usia : " + usia + " tahun");
        }
}
