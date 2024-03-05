public class ElectricalPart implements AutoPart {
    @Override
    public void exchange() {
        System.out.println("I am exchanging electrical part");
    }

    @Override
    public void repair() {
        System.out.println("I am repairing electrical part");
    }

    @Override
    public void update() {
        System.out.println("I am updating electrical part");
    }
}
