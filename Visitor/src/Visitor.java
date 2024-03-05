public interface Visitor {
    void visit(BodyPart bodyPart);

    void visit(ElectricalPart electricalPart);

    void visit(SuspentionPart suspentionPart);
}