package semester2.Pertemuan2;
public class Mahasiswa14 {
   String nama;
   String nim;
   String kelas;
   double ipk;
   public Mahasiswa14() {
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
   void upadteIPK(Double var1) {
      this.ipk = var1;
      if (this.ipk >4 && this.ipk <0) {
         System.out.println("IPK tidak valid");
      }
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
