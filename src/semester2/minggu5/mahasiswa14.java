package semester2.minggu5;
public class mahasiswa14 {
    String nama,NIM,tahunmasuk;
    int UTS,UAS;
    public mahasiswa14() {}
    public mahasiswa14(String nama, String NIM, String tahunmasuk, int UTS, int UAS){
        this.nama = nama;
        this.NIM = NIM;
        this.tahunmasuk = tahunmasuk;
        this.UTS = UTS;
        this.UAS = UAS;}
    int maxDC(int[] arr, int kiri, int kanan) {
        if (kiri == kanan) {return arr[kiri];}
        int mid = (kiri + kanan) / 2;
        int maxkiri = maxDC(arr, kiri, mid);
        int maxkanan = maxDC(arr, mid + 1, kanan);
        if (maxkiri>maxkanan) {return maxkiri;
        }else{return maxkanan;}}
    int minDC(int[] arr, int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];}
        int tengah = (kiri + kanan) / 2;
        int minkiri = minDC(arr, kiri, tengah);
        int minkanan = minDC(arr, tengah + 1, kanan);
        if (minkiri<minkanan) {return minkiri;
        }else{return minkanan;}}
    double rataBF(int[] arr) {
        double total = 0;
        for (int nilai : arr) {total += nilai;}
        return total / arr.length;}}
