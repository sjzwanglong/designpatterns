package adapter;

/**
 * 适配器模式-对象配器模式读卡事例
 * 还有一种类适配模式，但由于使用的继承方式，违背了合成复用模式，耦合度比较高，不建议使用
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("====================================");
        TFCard tfCard = new TFCardImpl();
        SDCard tfCardAdapterSD = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(tfCardAdapterSD));
    }
}

interface SDCard {
    //读取SD卡方法
    String readSD();

    //写入SD卡功能
    int writeSD(String msg);
}

class SDCardImpl implements SDCard {
    public String readSD() {
        String msg = "sdcard read a msg :hello word SD";
        return msg;
    }

    public int writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}

interface Computer {
    String readSD(SDCard sdCard);
}

class ThinkpadComputer implements Computer {
    public String readSD(SDCard sdCard) {
        if (sdCard == null) throw new NullPointerException("sd card null");
        return sdCard.readSD();
    }
}

interface TFCard {
    String readTF();

    int writeTF(String msg);
}

class TFCardImpl implements TFCard {
    public String readTF() {
        String msg = "tf card reade msg : hello word tf card";
        return msg;
    }

    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}

class SDAdapterTF implements SDCard {
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    public int writeSD(String msg) {
        System.out.println("adapter write tf card");
        return tfCard.writeTF(msg);
    }
}