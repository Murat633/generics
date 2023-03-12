import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Customer> sehirler = new MyList<Customer>();
        Customer customer = new Customer();
        sehirler.add(customer);
        sehirler.add(customer);
        sehirler.add(customer);
    }
}