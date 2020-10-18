package creational.builder;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by : vedikagupta
 * Date : 19/10/20
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items)
            cost += item.price();
        return cost;
    }

    public void showItems() {
        for (Item item : items)
            System.out.println(item.name() + " $" + item.price() + " in " + item.packaging().pack() + " packaging");
    }
}