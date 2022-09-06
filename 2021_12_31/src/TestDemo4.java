/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-01-02
 * Time: 13:35
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ByteCopy {

    public void copy() throws Exception{

        FileInputStream fis =
                new FileInputStream("C:/Users/Administrator/Desktop/my.doc");
        FileOutputStream fos =
                new FileOutputStream("C:/Users/Administrator/Desktop/mycopy1.doc",true);
        int value = fis.read();

        while(value!=-1){
            fos.write(value);
            fos.flush();
            value = fis.read();
        }
        fis.close();
        fos.close();
    }

}
public class TestDemo4 {
    public static void main(String[] args) {

    }
}
