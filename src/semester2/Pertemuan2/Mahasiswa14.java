package semester2.Pertemuan2;
public class Mahasiswa14 {
   String nama;
   String nim;
   String kelas;
   double ipk;
   public Mahasiswa14() {
   }
   public Mahasiswa14(String nm, String nim, double ipk,String kls ) {
      nama = nm;
      this.nim = nim;
      this.ipk = ipk;
      kelas = kls;
   }
   void tampilakanInformasi() {
      System.out.println("Nama : " + this.nama);
      System.out.println("NIM : " + this.nim);
      System.out.println("Kelas : " + this.kelas);
      System.out.println("IPK : " + this.ipk);
   }
   void ubahKelas(String var1) {
      this.kelas = var1;
   }
   void upadteIPK(double var1) {
      if (this.ipk >4.0 && this.ipk <0) {
      System.out.println("IPK tidak valid");
      } else {this.ipk = var1;}
   }
   String NilaiKinerja() {
      if (this.ipk >= 3.5) {
         return "kinerja sangat baik";
      } else if (this.ipk >= 3.0) {
         return "kinerja baik";
      } else if (this.ipk >= 2.0) {
         return "kinerja cukup";
      } else  { return "kinerja kurang";}
   }
}
