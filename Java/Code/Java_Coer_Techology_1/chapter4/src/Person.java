public abstract class Person {
    private String name;

    public abstract String getDescription();

    public Person() {
    }

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
}
