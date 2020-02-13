package strategy;

/**
 * 策略模式
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        /**************************************************************************/
        Context2 context2 = new Context2();
        context2.setStrategy(new OperationAdd());
        System.out.println("10 + 5 = " + context2.executeStrategy(10, 5));
        context2.setStrategy(new OperationSubstract());
        System.out.println("10 - 5 = " + context2.executeStrategy(10, 5));
        context2.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context2.executeStrategy(10, 5));
    }
}

interface Strategy {
    public int doOperation(int num1, int num2);
}

class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationSubstract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

class Context2 {
    private Strategy strategy;

    public Context2() {

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}