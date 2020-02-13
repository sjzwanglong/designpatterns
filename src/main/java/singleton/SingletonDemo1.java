package singleton;

/***
 * 饿汉式第一种
 */
public class SingletonDemo1 {

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        System.out.println(s1 == s2);
    }
}

class Singleton1 {
    private static final Singleton1 _instance = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return _instance;
    }
}
