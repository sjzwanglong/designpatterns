package factory;

/**
 * 工厂模式-工厂方法模式
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        AnimalFarm hf = new HorseFarm();
        hf.newAnimal();
    }
}

interface Animal {
    public void show();
}

//具体产品：马类
class Horse implements Animal {
    public void show() {
        System.out.println("马");
    }
}

//具体产品：牛类
class Cattle implements Animal {
    public void show() {
        System.out.println("牛");
    }
}

//抽象工厂：畜牧场
interface AnimalFarm {
    public Animal newAnimal();
}

//具体工厂：养马场
class HorseFarm implements AnimalFarm {
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
}

//具体工厂：养牛场
class CattleFarm implements AnimalFarm {
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
}

