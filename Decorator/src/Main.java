public class Main {
    public static void main(String[] args) {

        IBike bike;
        bike = new Bike();
        bike = new Frame(bike);
        bike = new Brakes(bike);
        bike.decorate();
    }
}