package com.test.app.tests.app;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.test.app.tests.LoginPage;
import com.test.app.tests.MainPage;
import com.test.app.tests.Screenshotter;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by pavel on 8/19/17.
 */

@Listeners(Screenshotter.class)
public class LoginTest {

    @BeforeSuite
    public void setUp(){
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";

    }
    @Test
    public void testCanLoginAsValidUser(){
        //LoginPage loginPage=Selenide.open("http://35.192.212.141:8086/login", LoginPage.class);
        Selenide.open("http://35.192.212.141:8086");
        new LoginPage().loginAs("admin","admin");
        new MainPage().label.shouldHave(Condition.exactText("Video service"));

    }
    @Test(dependsOnMethods = "testCanLoginAsValidUser")
    public void testCanUploadFile(){
        new MainPage().uploadFile("big_buck_bunny.mp4");
    }
}
