package facade;

/**
 * 外观模式-进阶方式
 */
public class AbstractFacadeDemo {
    public static void main(String[] args) {
        ShapeMaker2 shapeMaker = new SubMaker1();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        ShapeMaker2 shapeMaker1 = new SubMaker2();

        shapeMaker1.drawCircle();
        shapeMaker1.drawRectangle();
        shapeMaker1.drawSquare();
    }
}

abstract class ShapeMaker2 {

    public void drawCircle() {
    }

    public void drawRectangle() {
    }

    public void drawSquare() {
    }
}

class SubMaker1 extends ShapeMaker2 {
    private Shape circle;
    private Shape square;

    public SubMaker1() {
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}

class SubMaker2 extends ShapeMaker2 {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public SubMaker2() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}