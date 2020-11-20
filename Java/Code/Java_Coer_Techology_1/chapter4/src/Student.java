public class Student extends Person {
    private String major;

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }


    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

}
