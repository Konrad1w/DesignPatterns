public class Limousine extends Vehicle {
    public Limousine(CarPaint paintWork, CarPaint polishWork, CarPaint removeDentsWork) {
        super(paintWork, polishWork, removeDentsWork);
    }

    @Override
    void applyChange() {
        System.out.println("Limousine is going to be modified");
        paintWork.doWork();
        polishWork.doWork();
        removeDentsWork.doWork();
    }
}
