package creational.builder;

/*
 * Created by : vedikagupta
 * Date : 19/10/20
 */
public abstract class ColdDrink implements Item {
    public Packaging packaging() {
        return new Bottle();
    }

    public abstract float price();
}
