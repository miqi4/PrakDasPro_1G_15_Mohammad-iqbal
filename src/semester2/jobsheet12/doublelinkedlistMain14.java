package semester2.jobsheet12;
public class doublelinkedlistMain14 {
    public static void main(String[] args)throws
    Exception{
        doubleLinkedList dll = new doubleLinkedList();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==============================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==============================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==============================================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());
    }
}
