package creational.builder;

/*
 * Created by : vedikagupta
 * Date : 19/10/20
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 10.0f;
    }

    public String name() {
        return "Coke";
    }
}
