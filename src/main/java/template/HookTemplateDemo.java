package template;

/**
 * 模版方法模式-增加钩子函数
 */
public class HookTemplateDemo {
    public static void main(String[] args) {
        HookAbstractClass tm = new HookConcreteClass();
        tm.TemplateMethod();
    }
}

//含钩子方法的抽象类
abstract class HookAbstractClass {
    public void TemplateMethod() //模板方法
    {
        abstractMethod1();
        HookMethod1();
        if (HookMethod2()) {
            SpecificMethod();
        }
        abstractMethod2();
    }

    public void SpecificMethod() //具体方法
    {
        System.out.println("抽象类中的具体方法被调用...");
    }

    public void HookMethod1() {
    }  //钩子方法1

    public boolean HookMethod2() //钩子方法2
    {
        return true;
    }

    public abstract void abstractMethod1(); //抽象方法1

    public abstract void abstractMethod2(); //抽象方法2
}

//含钩子方法的具体子类
class HookConcreteClass extends HookAbstractClass {
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    public void HookMethod1() {
        System.out.println("钩子方法1被重写...");
    }

    public boolean HookMethod2() {
        return false;
    }
}