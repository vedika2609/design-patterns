package creational.builder;

/*
 * Created by : vedikagupta
 * Date : 19/10/20
 */
public abstract class Burger implements Item {
    public Packaging packaging() {
        return new Wrapper();
    }

    public abstract float price();
}
