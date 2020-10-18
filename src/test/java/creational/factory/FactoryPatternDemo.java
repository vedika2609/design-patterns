package creational.factory;

import static creational.factory.ShapeFactory.ShapeType.*;

/*
 * Created by : vedikagupta
 * Date : 18/10/20
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(RECTANGLE);
        Shape shape2 = shapeFactory.getShape(CIRCLE);
        Shape shape3 = shapeFactory.getShape(SQUARE);
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
