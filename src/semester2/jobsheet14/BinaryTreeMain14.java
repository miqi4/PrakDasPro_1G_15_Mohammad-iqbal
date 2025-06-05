package semester2.jobsheet14;
public class BinaryTreeMain14 {
    public static void main(String[] args) {
        BinaryTree14 tree = new BinaryTree14();
        tree.add(new Mahasiswa14("244160185", "Candra", "C", 3.21));
        tree.add(new Mahasiswa14("244160220", "Dewi", "B", 3.54));
        tree.add(new Mahasiswa14("244160121", "Ali", "A", 3.57));
        tree.add(new Mahasiswa14("244160221", "Badar", "B", 3.85));
        System.out.println("Daftar semua mahasiswa (in oder traversal):");
        tree.traverseInOrder(tree.root);
        System.out.println("\n\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 = ");
        System.out.println(tree.find(3.54) ? "Ditemukan" : "Tidak ditemukan");
        System.out.print("Cari mahasiswa dengan ipk: 3.22 = ");
        System.out.println(tree.find(3.22) ? "Ditemukan" : "Tidak ditemukan");
        tree.addRekursif(new Mahasiswa14("244160205", "Ehsan", "D", 3.37));
        tree.addRekursif(new Mahasiswa14("244160210", "Fizi", "B", 3.46));
        tree.addRekursif(new Mahasiswa14("244160213", "Devi", "A", 3.72));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        tree.traverseInOrder(tree.root);
        System.out.println("\nPreOrder Traversal:");
        tree.traversePreOrder(tree.root);
        System.out.println("\nPostOrder Traversal:");
        tree.traversePostOrder(tree.root);
        System.out.println("\nPenghapusan data mahasiswa");
        tree.delete(3.57); 
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        tree.traverseInOrder(tree.root);
        System.out.println();
        tree.cariMaxIPK();
        System.out.println();
        tree.cariMinIPK();
        System.out.println();
        tree.tampilMahasiswaIPKdiAtas(3.5);
    }
}
