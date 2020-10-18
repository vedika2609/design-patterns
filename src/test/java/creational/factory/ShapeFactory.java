package creational.factory;
/*
 * Created by : vedikagupta
 * Date : 18/10/20
 */
public class ShapeFactory {
    Shape getShape(ShapeType shape){
        switch (shape){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
        }
        return null;
    }

    enum ShapeType{
        RECTANGLE, CIRCLE, SQUARE
    }
}
