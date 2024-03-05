public class BodyPart implements AutoPart {

    @Override
    public void exchange() {
        System.out.println("I am exchanging body part");
    }

    @Override
    public void repair() {
        System.out.println("I am repairing body part");
    }

    @Override
    public void update() {
        System.out.println("I am updating body part");
    }
}
