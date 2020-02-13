package factory;

/**
 * 工厂模式-简单工厂(非23种设计模式，违反OCP原则)
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        SimpleFactory shapeFactory = new SimpleFactory();
        Product producta = shapeFactory.newProduct("A");
        Product productb = shapeFactory.newProduct("B");
        producta.create();
        productb.create();

        Product productc = SimpleFactory.newProduct2("A");
        Product productd = SimpleFactory.newProduct2("B");
        productc.create();
        productd.create();
    }
}

class SimpleFactory {
    public Product newProduct(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else if (type.equals("B")) {
            return new ProductB();
        } else {
            return null;
        }
    }

    public static Product newProduct2(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else if (type.equals("B")) {
            return new ProductB();
        } else {
            return null;
        }
    }
}

interface Product {
    void create();
}

class ProductA implements Product {

    public void create() {
        System.out.println("创建 ProductA");
    }
}

class ProductB implements Product {

    public void create() {
        System.out.println("创建 ProductB");
    }
}