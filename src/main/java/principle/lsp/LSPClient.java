package principle.lsp;

public class LSPClient {

    public static void main(String[] args) {
        Bird bird1=new Swallow();
        Animal kiwi=new BrownKiwi();
        bird1.setSpeed(120);
        kiwi.setRunSpeed(120);
        System.out.println("如果飞行300公里：");
        try
        {
            System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时.");
            System.out.println("几维鸟将飞行"+kiwi.getRunTime(300)+"小时。");
        }
        catch(Exception err)
        {
            System.out.println("发生错误了!");
        }
    }

}
