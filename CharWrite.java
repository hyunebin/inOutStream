package inOutStream;

import java.io.FileWriter;
import java.io.Writer;

public class CharWrite {
    public static void main(String[] args)throws Exception{
        Writer writer  = new FileWriter("C:/test/test1.txt");

        char a = 'A';
        char b = 'B';
        char c = 'C';
        // 배열과 일부 출력은 byteStream 형과 동일하다.

        writer.write(a);
        writer.write(b);
        writer.write(c);

        writer.flush();
        writer.close();
    }
}
