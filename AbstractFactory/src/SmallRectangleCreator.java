public class SmallRectangleCreator extends ShapeCreator {
    @Override
    Shape factory() {
        return new SmallRectangle();
    }
}
