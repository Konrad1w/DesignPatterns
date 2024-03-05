public class StudentButton implements Button {
    String name;

    public StudentButton(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
