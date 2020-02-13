package builder;

/**
 * 建造者模式-抽象事例
 */
public class BuilderDemo2 {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();

        Director director1 = new Director(new ConcreteBuilder2());
        Product product1 = director1.construct();
        product1.show();
    }
}

class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        //显示产品的特性
        System.out.println(this.partA + "-" + this.partB + "-" + this.partC);
    }
}

abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {
        return product;
    }
}

class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}

class ConcreteBuilder2 extends Builder {
    public void buildPartA() {
        product.setPartA("ConcreteBuilder2 建造 PartA");
    }

    public void buildPartB() {
        product.setPartB("ConcreteBuilder2 建造 PartB");
    }

    public void buildPartC() {
        product.setPartC("ConcreteBuilder2 建造 PartC");
    }
}

class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}