package semester2.Praktikum05;
public class dosen14 {
    String kode;
    String Nama;
    Boolean Jeniskel;
    int usia;
    dosen14(){}
    dosen14(String kd, String NM, Boolean jk, int u){
        kode=kd;
        Nama=NM;
        Jeniskel=jk;
        usia=u;}
    void tampilkan(){
        System.out.println("kode : "+kode);
        System.out.println("nama : "+Nama);
        System.out.println("jenis kelamin : "+(Jeniskel?"laki laki":"Perempuan"));
        System.out.println("usia : "+usia);}}
