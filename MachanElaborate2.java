public class MachanElaborate2 {

    String brand;
    String model;

    public MachanElaborate2() {
        brand = "Toyota";
    }

    public MachanElaborate2(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public MachanElaborate2(MachanElaborate2 other) {
        this.brand = other.brand;
        this.model = other.model;
    }

    public void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
    }

    public static void main(String[] args) {
        MachanElaborate2 car1 = new MachanElaborate2();
        MachanElaborate2 car2 = new MachanElaborate2("Chevrolet", "Porsche");
        MachanElaborate2 car3 = new MachanElaborate2(car2);

        car1.displayCar();
        car2.displayCar();
        car3.displayCar();
    }
}
