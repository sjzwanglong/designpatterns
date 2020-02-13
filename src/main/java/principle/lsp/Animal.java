package principle.lsp;

public class Animal {

    private double runSpeed;

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public double getRunTime(double distance) {
        return(distance/this.runSpeed);
    }
}
