public class JavaMlHcs {
    // JAVA 命令行参数
    public static void main(String[] args) {
        for(String s:args){
            if("-version".equals(s)){
                System.out.println("-v1.0");
                break;
            }
        }

    }
}


