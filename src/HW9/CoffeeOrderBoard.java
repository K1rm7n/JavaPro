package HW9;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private int orderNumber;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
        this.orderNumber = 1;
    }

    public void add(String name) {
        Order order = new Order(orderNumber++, name);
        orders.add(order);
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            return null;
        }
        return orders.remove(0);
    }

    public Order deliver(int number) {
        for (Order order : orders) {
            if (order.getNumber() == number) {
                orders.remove(order);
                return order;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
        System.out.println("=============");
    }
}
