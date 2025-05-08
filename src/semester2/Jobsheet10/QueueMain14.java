package semester2.Jobsheet10;
import java.util.Scanner;
public class QueueMain14 {
    public static void menu() {
        System.out.println("masukan operasi yang di inginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. print ");
        System.out.println("4. Peek ");
        System.out.println("5. Clear");
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kapasistas queue :");
        int n =sc.nextInt(); 
        Queue14 q = new Queue14(n);
        int pilih=1;
        do {
            menu();
            pilih=sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("masukkan data baru : ");
                    int datamasuk = sc.nextInt();
                    q.enqueue(datamasuk);
                    break;
                case 2:
                    int datakeluar = q.Dequeue();
                    if (datakeluar!=0) {
                        System.out.println("data yang dikeluarkan "+datakeluar);
                        break;}               
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (pilih>=1 && pilih<=5);
    }
}
