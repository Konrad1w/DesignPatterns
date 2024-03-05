import java.util.List;

public class AdminButtonsBuilder extends ButtonsBuilder {
    @Override
    void addButtons() {
        listButtons.addAll(List.of(new AdminButton("add class"), new AdminButton("add profesor")));
    }
}
