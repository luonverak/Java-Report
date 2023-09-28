package Report;

import java.util.ArrayList;
import java.util.List;

public class ListData {
    final int id;
    final String name;
    final int qty;
    final float price;
    public ListData(int id, String name, int qty, float price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }
    static List<ListData> list=new ArrayList<>();
}
