package semester2.Jobsheet11;
public class Mahasiswa14 {
    String nama,kelas,Nim;
    double ipk;
    Mahasiswa14(){}
    Mahasiswa14(String Nim, String nama,String kelas, double ipk){
        this.nama=nama;
        this.Nim=Nim;
        this.kelas=kelas;
        this.ipk=ipk;
    }
    void tampilInformasi(){
        System.out.println(nama +"\t"+ Nim+"\t"+kelas+"\t"+ipk);
    }
}
