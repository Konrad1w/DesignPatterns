public class FabricationTimeVisitor implements Visitor {
    @Override
    public void visit(BodyPart bodyPart) {
        bodyPart.fabricationTime();
    }

    @Override
    public void visit(ElectricalPart electricalPart) {
        electricalPart.fabricationTime();
    }

    @Override
    public void visit(SuspentionPart suspentionPart) {
        suspentionPart.fabricationTime();
    }
}
