import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 写入文件 {
    public static void main(String[] args) throws IOException {
        File f =new File("d:/","xx/yy/pass.txt");
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bwf =new BufferedWriter(fw);
        bwf.write("\nww\t789");
        bwf.flush();
        bwf.close();

    }
}
