public class SquareCreator extends ShapeCreator {
    @Override
    Shape factory() {
        return new Square();
    }
}
