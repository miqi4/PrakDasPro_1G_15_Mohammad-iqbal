package semester2.Praktikum05;
public class dosenmain {
    public static void main(String[] args) {
    datadosen14 list=new datadosen14();
    dosen14 d1 =new dosen14("101","rafa",true,30);
    dosen14 d2 =new dosen14("102","ecen",true,29);
    dosen14 d3 =new dosen14("103","alif",true,33);
    dosen14 d4 =new dosen14("104","yayuk",false,44);
    dosen14 d5 =new dosen14("105","ayu",false,57);
    dosen14 d6 =new dosen14("106","nofal",true,61);
    dosen14 d7 =new dosen14("107","tia",false,37);
    dosen14 d8 =new dosen14("108","andi",true,28);
    dosen14 d9 =new dosen14("109","budi",true,39);
    dosen14 d10 =new dosen14("110","rusdi",true,50);
    list.tambah(d1);
    list.tambah(d2);
    list.tambah(d3);
    list.tambah(d4);
    list.tambah(d5);
    list.tambah(d6);
    list.tambah(d7);
    list.tambah(d8);
    list.tambah(d9);
    list.tambah(d10);
    System.out.println("data dosen sebelum sorting");
    list.tampil();
    System.out.println();
    System.out.println("data dosen setelah sorting bubblesort berdasarkan umur (ASC) : ");
    list.bubblesort();
    list.tampil();
    System.out.println();
    System.out.println("data dosen setelah sorting selection berdasarkan IPK (DESC) : ");
    list.selectionSort();
    list.tampil();
}}
