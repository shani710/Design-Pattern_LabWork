package GOF.Lab6.AbstractFactory;

public class DoubleBorderRoundedFactory extends AbstractFactory {

    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new DoubleBorderRoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new DoubleBorderRoundedSquare();
        }
        return null;
    }

}
