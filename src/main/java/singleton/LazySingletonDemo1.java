package singleton;

/**
 * 懒汉式第一种
 */
public class LazySingletonDemo1 {

    public static void main(String[] args) {
        LazySingleton1 s1 = LazySingleton1.getInstance();
        LazySingleton1 s2 = LazySingleton1.getInstance();

        System.out.println(s1 == s2);
    }
}

class LazySingleton1 {
    private static LazySingleton1 _instance;

    private LazySingleton1() {
    }

    public static LazySingleton1 getInstance() {
        if (_instance == null) {
            _instance = new LazySingleton1();
        }
        return _instance;
    }
}