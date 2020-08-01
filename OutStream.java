package inOutStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutStream {
    public static void main(String[] args) throws Exception{
        OutputStream os = new FileOutputStream("C:/test/test.db");

        byte a = 10;
        byte b = 20;
        byte c = 30;

        byte[] array = {10,20,30,40,50};
        os.write(array); //배열 스트림

        os.write(array ,1,3); // 지정된 배열 출력 write(byte[], int off, int len)


        os.write(a); // a를 1바이트씩 출력
        os.write(b);
        os.write(c);

        os.flush();// 출력버퍼에 잔류 모든 바이트를 출력
        os.close();// 출력 스트림 닫음
    }
}
