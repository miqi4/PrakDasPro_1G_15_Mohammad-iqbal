package semester2.Praktikum05;

public class SortingMain14 {
    public static void main(String[] args) {
        int a[]={20,10,2,7,12};
        int b[]={30,20,2,8,14};
        int c[]={40,10,4,9,3};

    Sorting14 dataurut1 = new Sorting14(a, a.length);
    System.out.println("data awal 1");
    dataurut1.tampil();
    System.out.println("data sudah diurutkan dengan bubble sort (ASC)");
    dataurut1.tampil();
    System.out.println();

    Sorting14 dataurut2 = new Sorting14(b, b.length);
    System.out.println("data awal 2");
    dataurut2.tampil();
    dataurut2.selectionsort();
    System.out.println("data sudah diurutkan dengan selection sort (ASC)");
    dataurut2.tampil();
    System.out.println();

    Sorting14 dataurut3 = new Sorting14(c, c.length);
    System.out.println("data awal 3");
    dataurut3.tampil();
    dataurut3.insertionsort();
    System.out.println("data sudah diurutkan dengan insertion sort (ASC)");
    dataurut3.tampil();
    }
}
