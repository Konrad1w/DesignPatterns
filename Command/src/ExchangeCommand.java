public class ExchangeCommand implements Command {
    AutoPart autoPart;

    ExchangeCommand(AutoPart autoPart) {
        this.autoPart = autoPart;
    }

    @Override
    public void execute() {
        autoPart.exchange();
    }
}
