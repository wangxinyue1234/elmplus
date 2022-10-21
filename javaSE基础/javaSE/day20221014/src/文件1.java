import java.io.File;

public class 文件1 {
    public static void main(String[] args) {
        File file = new File("c:/a/b/c");
        if (!file.exists()){
            System.out.println("不存在根目录");
            if(file.mkdir()){
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败 ");
            }
        }
    }
}
