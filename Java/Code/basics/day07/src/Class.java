public class Class {

    int class_num;
    String grade;

    public Class(int class_num, String grade) {
        this.class_num = class_num;
        this.grade = grade;
    }

    public Class() {
    }

    public int getClass_num() {
        return class_num;
    }

    public void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
