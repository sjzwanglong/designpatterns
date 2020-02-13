package singleton;

/***
 * 饿汉式第二种
 */
public class SingletonDemo2 {

    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        System.out.println(s1 == s2);
    }
}

class Singleton2 {
    private static Singleton2 _instance = null;

    private Singleton2() {
    }

    static {
        _instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return _instance;
    }
}
