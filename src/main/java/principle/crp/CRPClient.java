package principle.crp;

public class CRPClient {

    public static void main(String[] args) {
        Car gasCar = new GasCar(new Yellow());

        gasCar.move();
    }
}
