package fr.istic.m1.sir;

import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FirstArchive {

    public static void main(String[] args) {

        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("conf" + File.separator + "config.properties")) {

            // load a properties file
            prop.load(input);
            String name = prop.getProperty("name");

            if (!StringUtils.isEmpty(name)) {
                System.out.println(name);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
