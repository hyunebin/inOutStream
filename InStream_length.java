package inOutStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InStream_length {
    public static void main(String[] args)throws Exception{
        InputStream is = new FileInputStream("C:/test/test.db");

        byte [] buffer = new byte[100];

        int readLength = is.read(buffer, 2, 5);
        if(readLength != -1){
            for(int i = 0; i <readLength; i++){
                System.out.println(buffer[i]);
            }
        }
        is.close();
    }
}
