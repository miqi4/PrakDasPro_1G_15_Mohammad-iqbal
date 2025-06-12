package semester2.jobsheet15;
import java.util.ArrayList;
import java.util.Collections;
public class DemoArrayList14 {
    public static void main(String[] args) {
        ArrayList<Customer14> customers = new ArrayList<>();
        Customer14 customer1 = new Customer14(1, "zakia");
        Customer14 customer2 = new Customer14(5, "budi");
        customers.add(customer1);
        customers.add(customer2);
        customers.add( new Customer14 (4, "Cica"));
        customers.add(2,new Customer14 (100, "Rosa"));
        System.out.println(customers.indexOf(customer2));
        Customer14 costumer = customers.get(1);
        System.out.println(costumer.nama);
        costumer.nama= "Budi utomo";
        ArrayList<Customer14> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer14(201, "Della"));
        newCustomers.add(new Customer14(202, "Victor"));
        newCustomers.add(new Customer14(203, "Sarah"));
        customers.addAll(newCustomers);
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        System.out.println(daftarSiswa);
        customers.sort((c1, c2) -> c1.id - c2.id);
        for (Customer14 cust : customers) {
            System.out.println(cust.toString());
        }
        System.out.println(customers);
    }
}
