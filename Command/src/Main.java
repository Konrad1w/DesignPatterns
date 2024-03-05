public class Main {
    public static void main(String[] args) {
        Command command = new ExchangeCommand(new BodyPart());
        command.execute();
    }
}