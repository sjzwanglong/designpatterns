package singleton;

/**
 * 懒汉式第三种
 */
public class LazySingletonDemo3 {

    public static void main(String[] args) {

    }
}

class LazySingleton3 {
    private static LazySingleton3 _instance;

    private LazySingleton3() {
    }

    public static synchronized LazySingleton3 getInstance() {
        if (_instance == null) {
            synchronized (LazySingleton3.class) {
                _instance = new LazySingleton3();
            }
        }
        return _instance;
    }
}