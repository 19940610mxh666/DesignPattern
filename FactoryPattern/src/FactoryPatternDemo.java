public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape cirCle = ShapeFactory.getShape("CIRCle");
        cirCle.draw();
    }
}
