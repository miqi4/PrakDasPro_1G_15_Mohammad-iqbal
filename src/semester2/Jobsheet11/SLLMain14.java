package semester2.Jobsheet11;

import semester2.Jobsheet10.mahasiswa14;

public class SLLMain14 {
    public static void main(String[] args) {
        SingleLinkedList14 sll = new SingleLinkedList14();
        Mahasiswa14 mhs1 = new Mahasiswa14("24212200","Alvaro","1A",4);
        Mahasiswa14 mhs2 = new Mahasiswa14("23212201","Bimon","2B",3.8);
        Mahasiswa14 mhs3 = new Mahasiswa14("22212202","Cintia","3C",3.5);
        Mahasiswa14 mhs4 = new Mahasiswa14("21212203","Dirga","4D",3.6);
        sll.print();
        sll.addfirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
