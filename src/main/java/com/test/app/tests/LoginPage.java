package com.test.app.tests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by pavel on 8/19/17.
 */
public class LoginPage {
    SelenideElement login = $(By.xpath("//*[@id=\"inputEmail3\"]"));
    SelenideElement password = $(By.xpath("//*[@id=\"inputPassword3\"]"));
    SelenideElement loginBtn = $(By.xpath("//*[@id=\"parent\"]/form/div[3]/div/button"));

    public  void loginAs(String name, String pass){
        login.setValue(name);
        password.setValue(pass);
        loginBtn.click();
    }
}
