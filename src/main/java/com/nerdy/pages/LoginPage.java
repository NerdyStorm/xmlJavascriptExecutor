package com.nerdy.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (how = How.XPATH , using = "//input[@id='username']") WebElement username;
    @FindBy (how = How.XPATH , using = "//input[@id='password']") WebElement password;
    @FindBy (how = How.XPATH , using = "//button[text()='Sign in']") WebElement submit;

    public void login(String u, String p){

        //username.sendKeys(u);
        //password.sendKeys(p);


        // submit.click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('value'," + "'"+ u + "'" + ")", username);
        jse.executeScript("arguments[0].setAttribute('value'," + "'"+ p + "'" + ")", password); 

        jse.executeScript("arguments[0].click()", submit);



    }

}
