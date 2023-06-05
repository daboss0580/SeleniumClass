package Class05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E6ConfigReader {
    public static void main(String[] args) throws IOException {
       String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("password"));
    }
}