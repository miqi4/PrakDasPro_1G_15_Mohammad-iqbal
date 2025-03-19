package semester2.minggu5;
public class mahasiswamain14 {
    public static void main(String[] args) {
        mahasiswa14[] mahasiswa = new mahasiswa14[8];
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Dina", "Hadi"};
        String[] nim = {"220101001","220101002","220101003","220101004","220101005","220101006","220101007","220101008"};
        String[] tahun = {"2022","2022","2021","2021","2023","2020","2023","2020"};
        int[] UTS= {78,85,90,76,92,88,80,82};
        int[] UAS= {82,88,87,79,95,85,83,84};
        for (int i = 0; i < 8; i++) {
            mahasiswa[i] = new mahasiswa14(nama[i], nim[i], tahun[i], UTS[i], UAS[i]);
        }
        int[] nilaiUTS = new int[mahasiswa.length];
        int[] nilaiUAS = new int[mahasiswa.length];
        for (int i = 0; i < mahasiswa.length; i++) {
            nilaiUTS[i] = mahasiswa[i].UTS;
            nilaiUAS[i] = mahasiswa[i].UAS;
        }
        mahasiswa14 mhs = new mahasiswa14();
        int utsTertinggi = mhs.maxDC(nilaiUTS, 0, nilaiUTS.length - 1);
        int utsTerendah = mhs.minDC(nilaiUTS, 0, nilaiUTS.length - 1);
        double rataUAS = mhs.rataBF(nilaiUAS);
        System.out.println("Nilai UTS Tertinggi : " + utsTertinggi);
        System.out.println("Nilai UTS Terendah : " + utsTerendah);
        System.out.println("Rata-rata Nilai UAS : " + rataUAS);
    }
}

