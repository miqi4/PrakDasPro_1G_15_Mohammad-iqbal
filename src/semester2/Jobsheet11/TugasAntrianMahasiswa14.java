package semester2.Jobsheet11;
public class TugasAntrianMahasiswa14 {
    TugasNode14 depan, belakang;
    int jumlah;
    public TugasAntrianMahasiswa14() {
        depan = belakang = null;
        jumlah = 0;}
    public boolean isEmpty() {
        return depan == null;}
    public boolean isFull() {
        return false;}
    public void tambahAntrian(TugasMahasiswa14 mhs) {
        TugasNode14 baru = new TugasNode14(mhs);
        if (isEmpty()) {
            depan = belakang = baru;
        } else {
            belakang.berikutnya = baru;
            belakang = baru;}
        jumlah++;}
    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
        } else {
            System.out.println("Memanggil Mahasiswa:");
            depan.data.tampilData();
            depan = depan.berikutnya;
            jumlah--;
            if (depan == null) {
                belakang = null;
            }}}
    public void tampilkanAntrianPertama() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan:");
            depan.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }}
    public void tampilkanAntrianTerakhir() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Belakang:");
            belakang.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");}}
    public void kosongkanAntrian() {
        depan = belakang = null;
        jumlah = 0;
        System.out.println("Antrian telah dikosongkan.");}
    public void tampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            TugasNode14 temp = depan;
            int i = 1;
            while (temp != null) {
                System.out.println("Antrian ke-" + i++);
                temp.data.tampilData();
                System.out.println("-----------------");
                temp = temp.berikutnya;}}}
    public int hitungJumlahAntrian() {
        return jumlah;
    }
}
