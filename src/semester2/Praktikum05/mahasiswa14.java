package semester2.Praktikum05;
public class mahasiswa14 {
    String NIM;
    String nama;
    String kelas;
    double ipk;

    mahasiswa14(){
    }
    mahasiswa14(String NIM, String nama, String kelas, double ipk){
        this.NIM=NIM;
        this.nama=nama;
        this.kelas=kelas;
        this.ipk=ipk;
    }
    void tampilinformasi(){
        System.out.println("nama : "+nama);
        System.out.println("NIM : "+NIM);
        System.out.println("Kelas : "+kelas);
        System.out.println("IPK : "+ipk);
    }
}
