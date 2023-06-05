package Class05;

import Utilities.ConfigReader;

import java.io.IOException;
import java.net.URL;

public class E5ConfigFiles {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("URL"));
    }
}
