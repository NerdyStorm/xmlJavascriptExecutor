package com.nerdy.test;

import com.nerdy.pages.LoginPage;
import com.nerdy.utils.BrowserFactory;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BrowserFactory {

    WebDriver driver;
    LoginPage loginPage;
    
    @BeforeMethod
    public void initialize(){

        driver = init();
        loginPage = new LoginPage(driver);

    }

    @Test
    @Parameters({"u1", "p1"})
    public void loginTest(String u, String p){

        loginPage.login(u, p);

    }

}
