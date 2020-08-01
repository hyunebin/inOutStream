package inOutStream;

import java.io.*;


public class ByteToChar {
    public static void main(String[] args)throws Exception{
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);


    }

    public static void write(String a) throws Exception{
        FileOutputStream fos =  new FileOutputStream("C:/test/new.txt"); // 보조스트림에 연결
        Writer writer = new OutputStreamWriter(fos);// FileOutputStream을 outputStreamWriter에 연결
        writer.write(a);// 문자열 형식을 사용해 출력
        writer.flush();
        writer.close();
    }

    public static String read()throws Exception{
        FileInputStream fis = new FileInputStream("C:/test/test.txt"); //FileinputStream으로 반아온 txt를
        Reader reader = new InputStreamReader(fis); // InputStreamReader 보조 스트림에 연결
        char[] buff = new char[100];
        int readCharNum = reader.read(buff); //reader에있는 문자를 buff만큼 읽어옴
        reader.close();
        String data = new String(buff, 0, readCharNum); // String data에 읽어온 데이터를 0~readCharNum까지
        return data;
    }
}
