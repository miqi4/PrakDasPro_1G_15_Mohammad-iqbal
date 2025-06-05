package semester2.jobsheet14;
public class BinaryTreeArrayMain14 {
    public static void main(String[] args) {
        BinaryTreeArray14 bta = new BinaryTreeArray14();
        Mahasiswa14 mhs1 = new Mahasiswa14("244160121", "Ali", "A", 3.57);
        Mahasiswa14 mhs2 = new Mahasiswa14("244160185", "Candra", "C", 3.41);
        Mahasiswa14 mhs3 = new Mahasiswa14("244160221", "Badar", "B", 3.75);
        Mahasiswa14 mhs4 = new Mahasiswa14("244160220", "Dewi", "B", 3.35);
        Mahasiswa14 mhs5 = new Mahasiswa14("244160213", "Devi", "A", 3.48);
        Mahasiswa14 mhs6 = new Mahasiswa14("244160205", "Ehsan", "D", 3.61);
        Mahasiswa14 mhs7 = new Mahasiswa14("244160210", "Fizi", "B", 3.86);
        Mahasiswa14[] dataMahasiswa = {
            mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null
        };
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
