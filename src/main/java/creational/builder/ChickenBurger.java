package creational.builder;

/*
 * Created by : vedikagupta
 * Date : 19/10/20
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.0f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
