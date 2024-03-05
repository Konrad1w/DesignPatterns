public class FabricaCostVisitor implements Visitor {
    @Override
    public void visit(BodyPart bodyPart) {
        bodyPart.fabricationCost();
    }

    @Override
    public void visit(ElectricalPart electricalPart) {
        electricalPart.fabricationCost();
    }

    @Override
    public void visit(SuspentionPart suspentionPart) {
        suspentionPart.fabricationCost();
    }
}
