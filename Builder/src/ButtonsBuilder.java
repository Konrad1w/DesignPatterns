import java.util.ArrayList;
import java.util.List;

public abstract class ButtonsBuilder {
    protected List<Button> listButtons;

    ButtonsBuilder() {
        listButtons = new ArrayList<>();
    }

    abstract void addButtons();
}
