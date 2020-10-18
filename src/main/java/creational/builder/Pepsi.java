package creational.builder;

/*
 * Created by : vedikagupta
 * Date : 19/10/20
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 15.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
