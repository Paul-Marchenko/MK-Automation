package com.test.app.tests;

import com.codeborne.selenide.SelenideElement;
//import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by pavel on 8/19/17.
 */
public class MainPage {
    public SelenideElement label = $(By.xpath("/html/body/div[1]/nav/div/div[1]/a"));
    private SelenideElement uploadInput = $(By.xpath("#v-0"));
    private SelenideElement uploadBtn = $("#upload_submit > button");


    public  void uploadFile(String name){
        uploadInput.uploadFromClasspath(name);
        uploadBtn.click();
    }
}


