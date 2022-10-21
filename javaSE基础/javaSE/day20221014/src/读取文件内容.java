import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class 读取文件内容 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\xx\\yy\\pass.txt");
        FileReader fileReader = new FileReader(file);
        //System.out.println(fileReader.read());
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
        while (true){
            String temp =bufferedReader.readLine();
            if (temp !=null){
                System.out.println(temp);
                continue;
            }
            break;
        }
    }
}
