abstract class ShapeCreator {
    abstract Shape factory();

    void render() {
        Shape shape = factory();
        shape.draw();
    }

}
