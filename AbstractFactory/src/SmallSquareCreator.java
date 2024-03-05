public class SmallSquareCreator extends ShapeCreator {
    @Override
    Shape factory() {
        return new SmallSquare();
    }
}
