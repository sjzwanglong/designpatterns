package singleton;

/**
 * 枚举单例
 */
public class EnumSingletonDemo {

    public static void main(String[] args) {
        Singletion.INSTANCE.say();
    }
}

enum Singletion {
    INSTANCE;
    public void say() {
        System.out.println("ok!");
    }
}
