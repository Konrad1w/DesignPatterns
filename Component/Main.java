public class Main {
    public static void main(String[] args) {
        Faculty f = new Faculty("Informatyki", 0, "8-18");
        f.add(new Department("Department Informatyki sledczej", 1, "10-14"));
        f.add(new Institute("Instytut Informatyki i matematyki komputerowej", 2, "10-14"));
        f.add(new Employee("Robert Kowalski", 3, "8-10"));
        f.printName();
    }
}
