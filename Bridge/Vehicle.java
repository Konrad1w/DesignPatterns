public abstract class Vehicle {
    protected CarPaint paintWork;
    protected CarPaint polishWork;
    protected CarPaint removeDentsWork;

    public Vehicle(CarPaint paintWork, CarPaint polishWork, CarPaint removeDentsWork) {
        this.paintWork = paintWork;
        this.polishWork = polishWork;
        this.removeDentsWork = removeDentsWork;
    }

    abstract void applyChange();
}
