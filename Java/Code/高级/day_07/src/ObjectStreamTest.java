import java.io.*;

public class ObjectStreamTest {
    // 对象流
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        methodWrite();
        methodRead();

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
}
