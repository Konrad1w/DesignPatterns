public class Motorbike extends Vehicle {
    public Motorbike(CarPaint paintWork, CarPaint polishWork, CarPaint removeDentsWork) {
        super(paintWork, polishWork, removeDentsWork);
    }


    @Override
    void applyChange() {
        System.out.println("Motorbike is going to be modified");
        paintWork.doWork();
        polishWork.doWork();
        removeDentsWork.doWork();
    }
}
