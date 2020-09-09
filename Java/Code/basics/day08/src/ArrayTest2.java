import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {

        String str = "adfagi0qenrqwojonafa08q4rlkfjnoafa";

        char[] c = str.toCharArray();
        Arrays.sort(c);
        System.out.println(c);

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.println(c[i]);

        }
    }
}
