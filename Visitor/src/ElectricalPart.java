public class ElectricalPart implements AutoPart {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void fabricationCost() {
        System.out.println("Electrical part fabrication cost");
    }

    @Override
    public void fabricationTime() {
        System.out.println("Electrical part fabrication time");
    }

    @Override
    public void avgUsageTime() {
        System.out.println("Electrical part average usage time");
    }

    @Override
    public void yearlyCost() {
        System.out.println("Electrical part yearly cost");
    }
}
