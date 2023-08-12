package JavaInputOutputStreams;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTextFromFile {

    public static void getData(){
        try {
            InputStream myObj = new FileInputStream("C:/Users/srika/OneDrive/Documents/srikanth.txt");
            int i;
            while ((i=myObj.read()) != -1) {

                System.out.print((char)i);
            }
            myObj.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void setData() throws IOException {
        String data = "This is output stream data";
        OutputStream fs = new FileOutputStream("C:/Users/srika/OneDrive/Documents/srikanth.txt");
        byte[] b = data.getBytes();
        fs.write(b);
        System.out.println(b);
    }


    public static void main(String[] args) throws IOException {
        getData();

        setData();
    }
}
