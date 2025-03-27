package semester2.Praktikum06;
import java.util.Scanner;
public class mahasiswaBerprestasi14 {
    mahasiswa14[]listmhs;
    mahasiswaBerprestasi14(int size) {
        listmhs = new mahasiswa14[size];
    }
    int idx;
    Scanner input = new Scanner(System.in);
    void tambah(mahasiswa14 m){
        listmhs[idx] = m;
            idx++;
    }
    void bubblesort(){
        for (int i = 0; i < listmhs.length-1; i++) {
            for (int j = 1; j < listmhs.length-i; j++) {
                if (listmhs[j].ipk>listmhs[j-1].ipk) {
                    mahasiswa14 tmp = listmhs[j];
                    listmhs[j]=listmhs[j-1];
                    listmhs[j-1]=tmp;
                }}}}
    void tampil(){
        for (mahasiswa14 m : listmhs) {
            m.tampilinformasi();
            System.out.println("=======================================");
        }}
    int sequentialSearch(double cari){
        int posisi=-1;
        for (int j = 0; j < listmhs.length; j++) {
            if (listmhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }return posisi;
    }
    void tampilPosisi(double x, int pos){
        if (pos!=-1){
        System.out.println("data mahasiswa dengan IPK :" +(x)+ " ditemukan pada indeks " +(pos) );
        }
        else {
        System.out.println("data " +x+ "tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos){
        if (pos !=-1){
        System.out.println("nim\t : "+listmhs[pos].NIM);
        System.out.println("nama\t : "+listmhs[pos].nama);
        System.out.println("kelas\t : "+listmhs[pos].kelas);
        System.out.println("ipk\t : "+x);
        }
        else {
        System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right){
    int mid;
    if (right >= left) {
        mid = (left + right) / 2;
        if (cari == listmhs[mid].ipk) {
            return (mid);
        }
        else if (listmhs[mid].ipk > cari) {
            return findBinarySearch(cari, left, mid - 1);
        }
        else {
            return findBinarySearch(cari, mid + 1, right);
        }
    }
    return -1;
}
}
