package com.automation.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.omg.PortableServer.IdAssignmentPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.poms.Login;
import com.automation.poms.Manager;
import com.automation.poms.Tester;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/automation/steps")

public class TestRunner {

    public static WebDriver driver;
    public static Login login;
    public static Manager Manager;
    public static Tester Tester;
    public static WebDriverWait wait;

    @BeforeClass // this makes the method execute before all the steps
    public static void setup(){
        // make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
        Manager  = new Manager(driver);
        Manager  = new Manager(driver);
        Tester = new Tester(driver);
    
        // the WebDriverWait is used to tell Selenium to wait up to a set amount of time for a given condition
        wait = new WebDriverWait(driver, 2);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass // this makes the method execute after all the steps
    public static void teardown(){
        driver.quit();
    }  
}
