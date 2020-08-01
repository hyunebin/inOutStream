package inOutStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InStream {
    public static void main(String[] args)throws Exception{
        InputStream is = new FileInputStream("C:/test/test.db");

        while(true){
            int data = is.read(); // 1바이트씩 읽어 들어옴
            if(data == -1){
                break;
            }
            System.out.println(data);
        }
        is.close();
    }
}
