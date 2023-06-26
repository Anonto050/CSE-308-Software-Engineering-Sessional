package Builder;

import Components.*;
import Main.Order;

public class Type2_Builder implements PCBuilder{
    private Order order = new Order();

    @Override
    public void BuildBase() {
        order.Add(new Base());
    }

    @Override
    public void InsertProcessor() {
        order.Add(new Core_i7());
    }

    @Override
    public void Add_cooler() {
        order.Add(new Liquid_cooler());
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
