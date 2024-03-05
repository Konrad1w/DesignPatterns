abstract class ShapeCreator {
    abstract Shape factory();

    void render() {
        Shape Shape = factory();
        Shape.draw();
    }

}
