import java.io.*;
import java.util.ArrayList;

public class ObjectStreamTest {
    // 对象流
    public static void main(String[] args) throws IOException, ClassNotFoundException {


//        methodWrite();
//        methodRead();
            collectionSerialize();
    }

    public static void methodRead() throws IOException, ClassNotFoundException {
        ObjectInputStream obj_r = new ObjectInputStream(new FileInputStream("obj.txt"));

        Object o = obj_r.readObject();
        Person p = (Person)o;
        System.out.println(p);
        obj_r.close();

    }

    public static void methodWrite() throws IOException {
        ObjectOutputStream obj_w = new ObjectOutputStream(new FileOutputStream("obj.txt"));
        obj_w.writeObject(new Person("周杰伦",20));
        obj_w.close();

    }

    public static void collectionSerialize() throws IOException, ClassNotFoundException {
        ObjectOutputStream obj_w = new ObjectOutputStream(new FileOutputStream("obj.txt"));
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("周杰伦",20));
        list.add(new Person("詹姆斯",36));
        list.add(new Person("乔丹",43));


        obj_w.writeObject(list);
        ObjectInputStream obj_r = new ObjectInputStream(new FileInputStream("obj.txt"));
        Object o = obj_r.readObject();
        ArrayList<Person> list1 = (ArrayList<Person>) o;
        for (Person person : list1) {
            System.out.println(person);
        }

    }
}
