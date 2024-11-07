package pertemuan10;
import java.util.Scanner;
public class P10_Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key;
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};         
        System.out.print("masukkan menu yang ingin dicari = ");
            key = sc.nextLine();
            for (int i = 0; i < menu.length; i++) {
                if (key.equalsIgnoreCase(menu[i])) {
                    System.out.println(key+" tersedia ");
                    break;}
                if (key!=menu[i]&&i==menu.length-1) {
                    System.out.println(key+" tidak tersedia");
                }
        }
    }
}
