package creational.factory;

/*
 * Created by : vedikagupta
 * Date : 18/10/20
 */
class RoundedShapeFactory extends AbstractFactory {
    Shape getShape(ShapeType shape) {
        switch (shape) {
            case SQUARE:
                return new RoundedSquare();
            case RECTANGLE:
                return new RoundedRectangle();
        }
        return null;
    }
}
