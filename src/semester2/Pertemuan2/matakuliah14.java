package semester2.Pertemuan2;
public class matakuliah14 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    public matakuliah14() {}
    public matakuliah14(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;}
    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("=========================");}
    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("sks telah diubah");}
    void tambahJam(int jam) {
        this.jumlahJam += jam;}
    void kurangJam(int jam) {
        if (this.jumlahJam < jam) {
            System.out.println("pengurangan tidak dapat dilakukan");
        } else {this.jumlahJam -= jam;}}}

