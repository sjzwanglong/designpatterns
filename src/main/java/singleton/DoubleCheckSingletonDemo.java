package singleton;

/**
 * 双重检查
 */
public class DoubleCheckSingletonDemo {

    public static void main(String[] args) {

    }
}

class DoubleCheckSingleton {
    public static volatile DoubleCheckSingleton _instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (_instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (_instance == null) {
                    _instance = new DoubleCheckSingleton();
                }
            }
        }

        return _instance;
    }
}
