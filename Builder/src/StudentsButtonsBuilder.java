import java.util.List;

public class StudentsButtonsBuilder extends ButtonsBuilder {
    @Override
    void addButtons() {
        listButtons.addAll(List.of(new StudentButton("show plan"), new StudentButton("show proffesor")));
    }
}
