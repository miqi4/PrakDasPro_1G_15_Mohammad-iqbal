package semester2.Praktikum06;
public class datadosen14 {
    dosen14[] data=new dosen14[5];
    int idx;
    void tambah(dosen14 dosen){
        data[idx] = dosen;
            idx++;
    }
    void tampil14(){
        for (dosen14 dosen : data) {
            dosen.tampilkan();
            System.out.println("===============================");
        }}
        void sequentialSearch14(String cari){
            int dosen=0;
            for (int j = 0; j < data.length; j++) {
                if (data[j].Nama.equalsIgnoreCase(cari)) {
                    System.out.println("===========================================================");
                    System.out.println("data Dosen dengan nama : " +cari+ " ditemukan pada indeks " +j );
                    System.out.println("kode\t : "+data[j].kode);
                    System.out.println("nama\t : "+data[j].Nama);
                    System.out.println("jenis kelamin\t : "+(data[j].Jeniskel ? "Pria" : "Perempuan"));
                    System.out.println("umur\t : "+data[j].usia);
                    dosen++;
                }else{System.out.println();}
            }
            if (dosen > 1) {
                System.out.println("===========================================================");
                System.out.println("Peringatan Ditemukan lebih dari satu dengan nama "+cari+" !");
            } else if (dosen == 0) {
                System.out.println("===========================================================");
                System.out.println("Data Dosen dengan nama " + cari + " tidak ditemukan!");
            }
        }
        int findBinarySearch14(int cari, int left, int right){
            int mid;
            if (right >= left) {
                mid = (left + right) / 2;
                if (cari == data[mid].usia) {
                    return (mid);}
                else if (data[mid].usia > cari) {
                    return findBinarySearch14(cari, left, mid - 1);}
                else {
                    return findBinarySearch14(cari, mid + 1, right);}
                }
            return -1;
        }
        void tampilPosisi14(double x, int pos){
            if (pos!=-1){
            System.out.println("data dosen dengan usia :" +(x)+ " ditemukan pada indeks " +(pos) );
            }
            else {
            System.out.println("data " +x+ "tidak ditemukan");
            }
        }
        void tampilDataSearch14(double x, int pos){
            if (pos !=-1){
            System.out.println("kode\t : "+data[pos].kode);
            System.out.println("nama\t : "+data[pos].Nama);
            System.out.println("jenis kelamin\t : "+(data[pos].Jeniskel ? "Pria" : "Perempuan"));
            System.out.println("usia\t : "+x);
            }
            else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan");
}}}