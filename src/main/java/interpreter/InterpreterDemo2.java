package interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * 解释器模式-公交车卡的读卡器事例
 */
public class InterpreterDemo2 {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}

interface StrExpression {
    public boolean interpret(String info);
}

class StrTerminalExpression implements StrExpression {
    private Set<String> set = new HashSet<String>();

    public StrTerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) set.add(data[i]);
    }

    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}

class StrAndExpression implements StrExpression {
    private StrExpression city = null;
    private StrExpression person = null;

    public StrAndExpression(StrExpression city, StrExpression person) {
        this.city = city;
        this.person = person;
    }

    public boolean interpret(String info) {
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}

class Context {
    private String[] citys = {"韶关", "广州"};
    private String[] persons = {"老人", "妇女", "儿童"};
    private StrExpression cityPerson;

    public Context() {
        StrExpression city = new StrTerminalExpression(citys);
        StrExpression person = new StrTerminalExpression(persons);
        cityPerson = new StrAndExpression(city, person);
    }

    public void freeRide(String info) {
        boolean ok = cityPerson.interpret(info);
        if (ok) System.out.println("您是" + info + "，您本次乘车免费！");
        else System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
    }
}