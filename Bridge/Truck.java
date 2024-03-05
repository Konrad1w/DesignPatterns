public class Truck extends Vehicle {
    public Truck(CarPaint paintWork, CarPaint polishWork, CarPaint removeDentsWork) {
        super(paintWork, polishWork, removeDentsWork);
    }

    @Override
    void applyChange() {
        System.out.println("Truck is going to be modified");
        paintWork.doWork();
        polishWork.doWork();
        removeDentsWork.doWork();
    }
}
