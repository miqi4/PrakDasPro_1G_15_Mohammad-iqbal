package semester2.Jobsheet9;

public class Mahasiswa14 {
    String nama,Nim,Kelas;
    int Nilai;
    Mahasiswa14(){}
    Mahasiswa14(String nama, String Nim, String Kelas){
        this.nama=nama;
        this.Nim=Nim;
        this.Kelas=Kelas;
        Nilai=-1;
    }
    void TugasDinilai(int Nilai){
        this.Nilai=Nilai;
    }
    
}
