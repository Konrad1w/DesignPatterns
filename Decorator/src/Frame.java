public class Frame extends BikeDecorator {
    public Frame(IBike bike) {
        super(bike);
    }

    @Override
    public void decorate() {
        decorateFrame();
        super.decorate();
    }

    public void decorateFrame() {

        System.out.println("decorating frame");
    }
}
