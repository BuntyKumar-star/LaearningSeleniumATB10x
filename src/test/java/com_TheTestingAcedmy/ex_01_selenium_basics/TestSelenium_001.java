package com_TheTestingAcedmy.ex_01_selenium_basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium_001 {
    public static void main(String[] args){
        @Test
        public void test_verifyVWOLogin() {
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://app.vwo.com");
            driver.quit();
        }


    }
}
