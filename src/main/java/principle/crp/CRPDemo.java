package principle.crp;

class Car {
    Color color;

    public Car(Color color) {
        this.color = color;
    }

    public void move() {

    }
}

class GasCar extends Car {
    public GasCar(Color color) {
        super(color);
    }

    public void move() {
        System.out.println("GasCar is " + this.color.color);
    }
}

class EleCar extends Car {
    public EleCar(Color color) {
        super(color);
    }

    public void move() {
        System.out.println("EleCar is " + this.color.color);
    }
}

class Color {
    String color;
}

class Blue extends Color {

    public Blue() {
        this.color = "blue";
    }
}

class Yellow extends Color {

    public Yellow() {
        this.color = "yellow";
    }
}