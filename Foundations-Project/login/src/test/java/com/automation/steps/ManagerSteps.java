package com.automation.steps;

import java.io.Console;
import java.util.jar.Attributes.Name;

import org.junit.Assert;
import org.omg.PortableServer.IdAssignmentPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ManagerSteps {

    long time = System.currentTimeMillis();

    @Given("The manager is on the manager homepage")
    public void the_manager_is_on_the_manager_homepage() {

        TestRunner.driver.get("File://C:Users/Tkoo/Desktop/Revature_VisualCode/BugCatcher/manager.html");
    }
      @When("The manager can add defects in the create defects textbox")
    public void the_manager_can_add_defects_in_the_create_defects_textbox() {
    // Write code here that turns the phrase above into concrete actions
        TestRunner.Manager.enterNewDefect("New Test Defect " + time);
    }
    @When("The manager can choose the tester from testers selection options")
    public void the_manager_can_choose_the_tester_from_testers_selection_options() {
    // Write code here that turns the phrase above into concrete actions
        Select dropdown = new Select(TestRunner.driver.findElement(By.id("listTesterId")));  
        dropdown.selectByVisibleText("Quyen1"); 
    }
    @When("The manager clicks the Click to Assign New Defect button")
    public void the_manager_clicks_the_Click_to_Assign_New_Defect_button() {
       TestRunner.Manager.clickButton();
    }
    
    @Then("the new defect should be shown in the defects table on manager homepage")
    public void the_new_defect_should_be_shown_in_the_defects_table_on_manager_homepage() {
    Assert.assertEquals("New Test Defect " + time, TestRunner.Manager.getLastDefectName());
}

}
