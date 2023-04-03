package order;

import java.io.Serializable;
import java.util.List;

public class OrderBase implements Serializable {

    private static final long serialVersionUID = 1;

    List<Order> orderList;

    public OrderBase(){}

    public OrderBase(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
