package semester2.Pertemuan3.Praktikum03;

public class Datadosen14 {
    int laki,Perempuan;
    void dataSemuaDosen(Dosen14[] arrayOfDosen){
        for(Dosen14 dosen : arrayOfDosen){
            System.out.println("Kode Dosen: " + dosen.kode);
            System.out.println("Nama Dosen: " + dosen.nama);
            System.out.println("Jenis Kelamin: " + (dosen.jenisKelamin? "Laki-Laki" : "Perempuan"));
            System.out.println("Usia: " + dosen.usia);
            System.out.println();
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen){
        laki = 0;
        Perempuan = 0;
        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                laki++;
            } else {
                Perempuan++;
            }
        }
        System.out.println("Jumlah Dosen Laki-Laki: " + laki);
        System.out.println("Jumlah Dosen Perempuan: " + Perempuan);
    }
    void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen){
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        int cewe=0, cowo=0;
        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
                cowo = totalUsiaPria/jumlahPria;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
                cewe = totalUsiaWanita/jumlahWanita;
            }
        }
        System.out.println("Rata-rata usia dosen pria: " +cowo );
        System.out.println("Rata-rata usia dosen wanita: "+cewe);
    }
    void dosenpalingmuda(Dosen14[] arrayOfDosen){
        int min = arrayOfDosen[0].usia;
        Dosen14 dosenPalingMuda = arrayOfDosen[0];
        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.usia < min) {
                min = dosen.usia;
                dosenPalingMuda = dosen;
            }
        }
        System.out.println("Dosen paling muda: " + dosenPalingMuda.nama + ", Usia: " + dosenPalingMuda.usia);
    }
    void dosenpalingtua(Dosen14[] arrayOfDosen){
        int max = arrayOfDosen[0].usia;
        Dosen14 dosenPalingTua = arrayOfDosen[0];
        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.usia > max) {
                max = dosen.usia;
                dosenPalingTua = dosen;
            }
        }
        System.out.println("Dosen paling tua: " + dosenPalingTua.nama + ", Usia: " + dosenPalingTua.usia);
    }
}
