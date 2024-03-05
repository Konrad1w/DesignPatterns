public class Car extends Vehicle {
    public Car(CarPaint paintWork, CarPaint polishWork, CarPaint removeDentsWork) {
        super(paintWork, polishWork, removeDentsWork);
    }

    @Override
    void applyChange() {
        System.out.println("Car is going to be modified");
        paintWork.doWork();
        polishWork.doWork();
        removeDentsWork.doWork();
    }
}
