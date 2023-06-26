package Builder;

import Components.Components;
import Main.Order;

public interface PCBuilder {
    void BuildBase();
    void InsertProcessor();
    void Add_cooler();
    void AddComponents(Components cmp);
    Order GetOrder();
}
