import java.io.File;

public class FileBianLi {
    public static void main(String[] args) {
        File path = new File("/Users/laohangdeche/Pictures/LOL/皮肤原画","");
        File path2 = new File("/Users/laohangdeche/Pictures/LOL/皮肤原画",".DS_Store");
        System.out.println(path2.exists());
//        String[] file = path.list();
//
//        for (String s : file) {
//            System.out.println(s);
//        }
//        for (File listFile : path.listFiles()) {
//            System.out.println(listFile);
//            System.out.println(listFile.isDirectory());
//        }

        for (File file : path.listFiles()) {
//            System.out.println(file.getName());

//            if(file.getName().equals(".DS_Store"))  // 返回的是引用类型 String
            if(!file.isDirectory())  // 返回的是引用类型 String
                continue;
            for (File listFile : file.listFiles()) {
                    System.out.println(file.getName() + "-" + listFile.getName());
                    System.out.println(listFile.length()/1024 + "KB");



//                if(file.getName() == ".DS_Store" || listFile.getName() == ".DS_Store")
//                    continue;
//                System.out.println(file.getName() + listFile.getName());
            }
        }


    }

}
