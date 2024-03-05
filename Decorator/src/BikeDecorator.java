public class BikeDecorator implements IBike {
    IBike myBike;

    BikeDecorator(IBike bike) {
        myBike = bike;
    }

    @Override
    public void decorate() {
        if (myBike != null)
            myBike.decorate();
    }
}
