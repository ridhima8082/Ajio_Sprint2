package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class QAprops {
    static Properties properties;

    private QAprops() {
    }

    public static void init() {
        if (properties == null) { //if properties ==null, then only create and load the file
            properties = new Properties();
        }
        try {
            properties.load(new FileInputStream("src/test/resources/env.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getValue(String key) {
        init();
        return properties.getProperty(key);
    }
}




