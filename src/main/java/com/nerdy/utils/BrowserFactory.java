package com.nerdy.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    WebDriver driver;
    String key = "webdriver.chrome.driver";
    String value = "src/drivers/chromedriver.exe";
    String url = "";

    public WebDriver init(){

        System.setProperty(key, value);
        driver = new ChromeDriver();

        FileReader readProperties;
        try {
            readProperties = new FileReader("src/drivers/properties.config");

            Properties p = new Properties();
            p.load(readProperties);
            url = p.getProperty("url");

        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e2){
            e2.printStackTrace();
        }

        driver.get(url);
        return driver;

    }

}
