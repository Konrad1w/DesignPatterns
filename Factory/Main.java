public class Main {
    public static void main(String[] args) {
        SquareCreator squareCreator = new SquareCreator();
        Shape square = squareCreator.factory();
        square.draw();
    }
}
