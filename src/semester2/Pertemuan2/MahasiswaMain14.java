package semester2.Pertemuan2;

public class MahasiswaMain14 {
    public static void main(String[] args) {

        Mahasiswa14 mhs1 =new Mahasiswa14();
        mhs1.nama = "muhammad ali farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilakanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.upadteIPK( 3.60);
        mhs1.tampilakanInformasi();

        Mahasiswa14 mhs2 = new Mahasiswa14 ("annisa nabila","2141720160",3.25,"TI 2L");
        mhs2.upadteIPK(3.30);
        mhs2.tampilakanInformasi();

        Mahasiswa14 mhsMohammadIqbal = new Mahasiswa14 ("Mohammad Iqbal","244107020105",3.44,"TI 1G");
        mhsMohammadIqbal.tampilakanInformasi();
    }
}

