package creational.builder;

/*
 * Created by : vedikagupta
 * Date : 19/10/20
 */
public class VegBurger extends Burger {
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
