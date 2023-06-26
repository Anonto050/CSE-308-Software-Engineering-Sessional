package Builder;

import Components.*;
import Main.Order;

public class GamingPCBuilder implements PCBuilder{
    private Order order = new Order();

    @Override
    public void BuildBase() {
        order.Add(new Base());
    }

    @Override
    public void InsertProcessor() {
        order.Add(new Ryzen());
    }

    @Override
    public void Add_cooler() {
        return;
    }

    @Override
    public void AddComponents(Components cmp) {
        order.Add(cmp);
    }

    @Override
    public Order GetOrder() {
        return order;
    }
}
