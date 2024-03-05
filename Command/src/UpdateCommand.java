public class UpdateCommand implements Command {
    AutoPart autoPart;

    UpdateCommand(AutoPart autoPart) {
        this.autoPart = autoPart;
    }

    @Override
    public void execute() {
        autoPart.update();
    }
}
