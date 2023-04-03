import order.Order;
import order.OrderMethod;
import write_read_print.FileRead;
import write_read_print.PrintList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        OrderMethod.createOrder(FileRead.readRecipeList());
        List<Order> orderList = FileRead.readOrderList();
        PrintList.printOrderList(orderList);

    }
}
