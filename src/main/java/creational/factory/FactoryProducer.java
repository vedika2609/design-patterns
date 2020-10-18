package creational.factory;

/*
 * Created by : vedikagupta
 * Date : 18/10/20
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded)
            return new RoundedShapeFactory();
        return new ShapeFactory();
    }
}