package semester2.Praktikum05;
public class mahasiswademo14 {
    public static void main(String[] args) {
        mahasiswaBerprestasi14 list = new mahasiswaBerprestasi14();
        mahasiswa14 m1 = new mahasiswa14();
        mahasiswa14 m2 = new mahasiswa14();
        mahasiswa14 m3 = new mahasiswa14();
        mahasiswa14 m4 = new mahasiswa14();
        mahasiswa14 m5 = new mahasiswa14();

        System.out.println("Data 1");list.tambah(m1);
        System.out.println("Data 2");list.tambah(m2);
        System.out.println("Data 3");list.tambah(m3);
        System.out.println("Data 4");list.tambah(m4);
        System.out.println("Data 5");list.tambah(m5);

        System.out.println("data mahasiswa sebelum sorting");
        list.tampil();
        System.out.println("data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubblesort();
        list.tampil();

        System.out.println( "Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println( "Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionsort();
        list.tampil();
    }
}
