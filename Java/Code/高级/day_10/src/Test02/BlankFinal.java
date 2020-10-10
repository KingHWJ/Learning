package Test02;

class Poppet {
    private int i;

    Poppet(int ii) {
        i = ii;
    }
}

public class BlankFinal {
    private final int i = 0; // Initialized final       初始化final
    private final int j; // Blank final                 空白final
    private final Poppet p; // Blank final reference    空白final对象
    // Blank finals MUST be initialized in constructor
    public BlankFinal() {
        j = 1; // Initialize blank final
        p = new Poppet(1); // Init blank final reference
    }

    public BlankFinal(int x) {
        j = x; // Initialize blank final
        p = new Poppet(x); // Init blank final reference
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
