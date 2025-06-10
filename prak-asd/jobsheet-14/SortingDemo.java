import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
  public static void main(String[] args) {
    ArrayList<String> daftarSiswa = new ArrayList<>();
    daftarSiswa.add("Zainab");
    daftarSiswa.add("Andi");
    daftarSiswa.add("Rara");
    Collections.sort(daftarSiswa);

    System.out.println(daftarSiswa);

    ArrayList<Customer> customers = new ArrayList<>();

    Customer cust1 = new Customer(7, "Ronaldo");
    Customer cust2 = new Customer(10, "Messi");
    customers.add(cust1);
    customers.add(cust2);

    customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

    System.out.println(customers);
  }
}