package com.testingacademy.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {


    public static String readKey(String Key)  {

        try {
            FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/data.properties");
            Properties properties=new Properties();
            properties.load(fileInputStream);
            return properties.getProperty(Key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
