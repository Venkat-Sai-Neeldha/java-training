package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EcommerceSystem {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1", false));
        orders.add(new Order("2", true));
        orders.add(new Order("3", false));
        orders.add(new Order("4", true));

        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.isdelivered()) {
                iterator.remove();
            }
        }

        System.out.println("Remaining orders: " + orders);
    }
}
