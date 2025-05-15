package semester2.Jobsheet11;
public class TugasMahasiswa14 {
    String nim, nama;
    String kelas;
    public TugasMahasiswa14(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    public void tampilData() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Kelas       : " + kelas);
    }
}
