package singleton;

/**
 * 懒汉式第二种
 */
public class LazySingletonDemo2 {

    public static void main(String[] args) {

    }
}

class LazySingleton2 {
    private static LazySingleton2 _instance;

    private LazySingleton2() {
    }

    public static synchronized LazySingleton2 getInstance() {
        if (_instance == null) {
            _instance = new LazySingleton2();
        }
        return _instance;
    }
}