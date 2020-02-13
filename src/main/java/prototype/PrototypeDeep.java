package prototype;

/**
 * 原型模式-深拷贝
 */
public class PrototypeDeep {

    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = (Circle) pm.getShapeDeep("Circle");
        obj1.countArea();
        Shape obj2 = (Shape) pm.getShapeDeep("Square");
        obj2.countArea();
    }
}