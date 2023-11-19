/**
 * 工厂：一个单独的类来做实例化的过程
 * 考虑下不使用工厂模式时，新增一个Shape子类，在Main中如何使用
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
