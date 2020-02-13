package singleton;

/**
 * 内部类单例
 */
public class InnerSingletonDemo {
    public static void main(String[] args) {

    }
}

class InnerSingleton {
    private InnerSingleton() {
    }

    private static class SingletonInstance {
        private static final InnerSingleton _instance = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return SingletonInstance._instance;
    }
}
