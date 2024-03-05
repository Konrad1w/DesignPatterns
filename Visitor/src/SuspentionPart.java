public class SuspentionPart implements AutoPart {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void fabricationCost() {
        System.out.println("Suspention part fabrication cost");
    }

    @Override
    public void fabricationTime() {
        System.out.println("Suspention part fabrication time");

    }

    @Override
    public void avgUsageTime() {
        System.out.println("Suspention part average usage time");

    }

    @Override
    public void yearlyCost() {
        System.out.println("Suspention part yearly cost");
    }
}
