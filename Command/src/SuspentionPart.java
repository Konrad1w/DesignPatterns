public class SuspentionPart implements AutoPart {

    @Override
    public void exchange() {
        System.out.println("I am exchanging suspension part");
    }

    @Override
    public void repair() {
        System.out.println("I am repairing suspension part");
    }

    @Override
    public void update() {
        System.out.println("I am updating suspension part");
    }
}
