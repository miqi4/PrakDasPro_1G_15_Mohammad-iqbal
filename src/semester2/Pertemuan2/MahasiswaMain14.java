package semester2.Pertemuan2;

public class MahasiswaMain14 {
    public static void main(String[] args) {

        Mahasiswa14 mhs1 =new Mahasiswa14();
        mhs1.nama = "muhammad ali farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilakanInformasi();
        mhs1.ubahKelas("SI 2J");
        mhs1.upadteIPK( 3.55);
        mhs1.tampilakanInformasi();
    }
}

