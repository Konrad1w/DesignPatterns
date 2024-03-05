public class YearlyCostVisitor implements Visitor {
    @Override
    public void visit(BodyPart bodyPart) {
        bodyPart.yearlyCost();
    }

    @Override
    public void visit(ElectricalPart electricalPart) {
        electricalPart.yearlyCost();
    }

    @Override
    public void visit(SuspentionPart suspentionPart) {
        suspentionPart.yearlyCost();
    }
}
