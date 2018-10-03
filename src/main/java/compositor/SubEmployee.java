package compositor;

public class SubEmployee implements Employee{

    private String name;

    public SubEmployee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Sub employee is writing code...");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SubEmployee{" +
                "name='" + name + '\'' +
                '}';
    }
}
