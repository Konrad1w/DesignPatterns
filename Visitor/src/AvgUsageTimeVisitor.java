public class AvgUsageTimeVisitor implements Visitor {
    @Override
    public void visit(BodyPart bodyPart) {
        bodyPart.avgUsageTime();
    }

    @Override
    public void visit(ElectricalPart electricalPart) {
        electricalPart.avgUsageTime();
    }

    @Override
    public void visit(SuspentionPart suspentionPart) {
        suspentionPart.avgUsageTime();
    }
}
