import java.io.File;
import java.io.FileFilter;

// 文件类过滤器实现类
public class FileFilterImp implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }else{
            if(pathname.getName().contains("源计划")){
                return true;
            }else
                return false;
        }

    }
}
