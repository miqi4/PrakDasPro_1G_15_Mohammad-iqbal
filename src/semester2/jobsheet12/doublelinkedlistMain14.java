package semester2.jobsheet12;
public class doublelinkedlistMain14 {
    public static void main(String[] args)throws
    Exception{
        doubleLinkedList dll = new doubleLinkedList();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("==========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("==========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("==========================");
        System.out.println("Data awal pada Linked Lists adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
    }
}
