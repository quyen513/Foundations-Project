package com.automation.poms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
    
    private WebDriver driver; // this driver will only be used internally (in the class) so it is private

    // these web elements need to be referenced in our steps so they are public
    // this tells the PageFactory to find the element with the id username and assign it to this field
    @FindBy(id = "newDefect") 
    public WebElement newDefect;

    @FindBy(id = "tester") 
    public WebElement tester;

    // this tells the PageFactory to find the element with the id password and assign it to this field
    @FindBy(id = "createNewDefect")
    public WebElement createNewDefect;

    @FindBy(id = "defectsTable")
    public WebElement defectsTable;

   public Manager(WebDriver driver){
        this.driver = driver; // this initializes the private driver field

        /*
            The PageFactory class is provided by Selenium and it abstracts away from us the code that handles
            initializing our WebElement fields. We simpply provide the initElements() method with the privite driver
            we initialize above, and the PageFactory class handles the rest!
         */
        PageFactory.initElements(driver,this);
     }

     public void enterNewDefect(String newDefect){

       
        this.newDefect.sendKeys(newDefect);
        
     }

     public void selectTester(String tester){

        // to  input element we use the sendKeys() method
        this.tester.sendKeys(tester);
        
     }

     // this method will make selenium click on create new defect button
     public void clickButton(){
      //click twice to create 2 defects,for tester to accept one and decline one
      //make sure tester dont run out of pending defect and cause error 
      this.createNewDefect.click();
      this.createNewDefect.click();
      }

     public String getLastDefectName() {
   
      List<WebElement> tableRows = this.driver.findElements(By.xpath("//*[@id=\"defectsTable\"]/thead/tr"));
     
      WebElement newRow = tableRows.get(tableRows.size()-1);

      List<WebElement> tds = newRow.findElements(By.tagName("td"));
      
      return tds.get(1).getText();

     }
}
