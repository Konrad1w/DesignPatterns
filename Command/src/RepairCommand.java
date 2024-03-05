public class RepairCommand implements Command {
    AutoPart autoPart;

    RepairCommand(AutoPart autoPart) {
        this.autoPart = autoPart;
    }

    @Override
    public void execute() {
        autoPart.repair();
    }
}
