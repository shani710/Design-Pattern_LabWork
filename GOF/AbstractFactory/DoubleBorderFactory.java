package GOF.Lab6.AbstractFactory;

public class DoubleBorderFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new DoubleBorderRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new DoubleBorderSquare();
        }
        return null;
    }

}
