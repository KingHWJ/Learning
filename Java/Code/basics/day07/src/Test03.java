public class Test03 {
    public static void main(String[] args) {

        Class class1 = new Class();
        class1.setClass_num(2);
        class1.setGrade("高一");
        System.out.printf("%s(%d)班\n",class1.grade,class1.class_num);

        Class class2 = new Class(3,"高三");
        System.out.printf("%s(%d)班\n",class2.grade,class2.class_num);

        Class class3 = new Class();
        class3.class_num = 6;
        class3.grade = "高二";
        System.out.printf("%s(%d)班\n",class3.grade,class3.class_num);

    }
}
