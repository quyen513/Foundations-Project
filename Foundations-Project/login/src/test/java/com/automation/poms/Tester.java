package com.automation.poms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester {
    private WebDriver driver;
    
    @FindBy(id = "acceptButton1")
    public WebElement acceptButton;
    
    @FindBy(id = "declineButton1")
    public WebElement declineButton;

    @FindBy(id = "rejectButton1")
    public WebElement rejectedButton;

    @FindBy(id = "fixButton2")
    public WebElement fixedButton;

    @FindBy(id = "shelveButton3")
    public WebElement shelvedButton;


    public Tester(WebDriver driver){
        this.driver = driver; // this initializes the private driver field

        /*
            The PageFactory class is provided by Selenium and it abstracts away from us the code that handles
            initializing our WebElement fields. We simpply provide the initElements() method with the privite driver
            we initialize above, and the PageFactory class handles the rest!
         */
        PageFactory.initElements(driver,this);
       
     }


    public void acceptButton(){
        this.acceptButton.click();
    }
    public void declineButton(){
        this.declineButton.click();
    }
    public void rejectedButton(){
        this.rejectedButton.click();
    }
    public void fixedButton(){
        this.fixedButton.click();
    }
    public void shelvedButton(){
        this.shelvedButton.click();
    }


}

