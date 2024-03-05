public class Brakes extends BikeDecorator {
    public Brakes(IBike bike) {
        super(bike);
    }

    @Override
    public void decorate() {
        decorateBrakes();
        super.decorate();
    }

    public void decorateBrakes() {

        System.out.println("decorating brakes");
    }
}
