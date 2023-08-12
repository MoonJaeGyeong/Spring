package hello.springcore.order;

public interface OrderService {
    Order createOrder(Long MemberId, String itemName, int  itemPrice);
}
