import java.util.ArrayList;
import java.util.List;

public class Faculty implements Uj {
    String name;
    int id;
    String workingHour;
    List<Uj> children;

    public Faculty(String name, int id, String workingHour) {
        this.name = name;
        this.id = id;
        this.workingHour = workingHour;
        children = new ArrayList<>();
    }

    void add(Uj child) {
        children.add(child);
    }

    void remove(Uj child) {
        children.remove(child);
    }

    @Override
    public void printName() {
        System.out.println(name);
        for (Uj child : children) {
            child.printName();
        }
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getHoursWorked() {
        return workingHour;
    }
}
