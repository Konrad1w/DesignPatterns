public class AdminButton implements Button {
    String name;

    public AdminButton(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
