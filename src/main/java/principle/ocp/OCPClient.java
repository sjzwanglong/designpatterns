package principle.ocp;

public class OCPClient {

    public static void main(String[] args) {
        ISubject subject1 = new Subject1();

        subject1.display();

        ISubject subject2 = new Subject2();

        subject2.display();
    }
}
