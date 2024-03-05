public class Main {
    public static void main(String[] args) {
        Visitor visitor = new AvgUsageTimeVisitor();
        SuspentionPart suspentionPart = new SuspentionPart();
        visitor.visit(suspentionPart);
    }
}