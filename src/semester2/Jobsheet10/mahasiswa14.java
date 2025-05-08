package semester2.Jobsheet10;
public class mahasiswa14 {
    String nama,kelas,Nim,Prodi;
    mahasiswa14(){}
    mahasiswa14(String Nim, String nama, String Prodi,String kelas){
        this.nama=nama;
        this.Nim=Nim;
        this.Prodi=Prodi;
        this.kelas=kelas;
    }
    public void tampilkandata(){
        System.out.println(Nim+" - "+nama+" - "+Prodi+" - "+kelas);
    }
    
}
