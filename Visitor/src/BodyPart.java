public class BodyPart implements AutoPart {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void fabricationCost() {
        System.out.println("Body part fabrication cost");
    }

    @Override
    public void fabricationTime() {
        System.out.println("Body part fabrication time");
    }

    @Override
    public void avgUsageTime() {
        System.out.println("Body part average usage time");
    }

    @Override
    public void yearlyCost() {
        System.out.println("Body part yearly cost");
    }
}
