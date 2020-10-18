package creational.factory;

import static creational.factory.ShapeType.*;

/*
 * Created by : vedikagupta
 * Date : 18/10/20
 */
public class FactoryPatternTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape(RECTANGLE).draw();
        shapeFactory.getShape(CIRCLE).draw();
        shapeFactory.getShape(SQUARE).draw();
    }
}
