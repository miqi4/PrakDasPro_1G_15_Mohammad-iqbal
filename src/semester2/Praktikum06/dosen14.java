package semester2.Praktikum06;
public class dosen14 {
    String kode;
    String Nama;
    boolean Jeniskel;
    int usia;
    dosen14(){}
    dosen14(String kd, String NM, boolean jk, int u){
        kode=kd;
        Nama=NM;
        Jeniskel=jk;
        usia=u;}
    void tampilkan(){
        System.out.println("kode : "+kode);
        System.out.println("nama : "+Nama);
        System.out.println("jenis kelamin : "+(Jeniskel?"Pria":"Perempuan"));
        System.out.println("usia : "+usia);}}
