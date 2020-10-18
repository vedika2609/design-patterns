package creational;

import creational.factory.AbstractFactory;
import creational.factory.FactoryProducer;

import static creational.factory.ShapeType.RECTANGLE;
import static creational.factory.ShapeType.SQUARE;

/*
 * Created by : vedikagupta
 * Date : 18/10/20
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        shapeFactory.getShape(RECTANGLE).draw();
        shapeFactory.getShape(SQUARE).draw();
        System.out.println("************************************************");
        shapeFactory = FactoryProducer.getFactory(false);
        shapeFactory.getShape(RECTANGLE).draw();
        shapeFactory.getShape(SQUARE).draw();
    }
}
