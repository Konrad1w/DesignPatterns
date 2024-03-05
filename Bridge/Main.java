public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new PaintWork(), new PolishWork(), new RemoveDentsWork());
        vehicle1.applyChange();
        Vehicle vehicle2 = new Limousine(new PaintWork(), new PolishWork(), new RemoveDentsWork());
        vehicle2.applyChange();
    }
}
