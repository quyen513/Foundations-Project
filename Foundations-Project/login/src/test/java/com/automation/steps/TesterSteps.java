package com.automation.steps;

import static org.junit.Assert.assertEquals;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {
    
    @Given("The Tester is on the Tester homepage")
public void the_Tester_is_on_the_Tester_homepage() {
    TestRunner.driver.get("File://C:/Users/Tkoo/Desktop/Revature_VisualCode/BugCatcher/login.html");
    TestRunner.login.enterUsername("Quyen1");
    TestRunner.login.enterPassword("pwd");
    TestRunner.login.clickButton();
//    TestRunner.driver.get("file:///C:/Users/Tkoo/Desktop/Revature_VisualCode/BugCatcher/tester.html");
}


@When("The Tester can clicks on the acccept defect")
public void the_Tester_can_clicks_on_the_acccept_defect() {
    
    TestRunner.Tester.acceptButton();
}
@Then("The accepted defect alert should be shown as accepted")
public void the_accepted_defect_alert_should_be_shown_as_accepted() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    Assert.assertEquals("Accepted", TestRunner.driver.switchTo().alert().getText() );
    TestRunner.driver.switchTo().alert().accept();
} 

@When("The Tester can clicks on the decline defect")
public void the_Tester_can_clicks_on_the_decline_defect() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.Tester.declineButton();
}

@Then("The decline defect alert should be shown as Declined")
public void the_decline_defect_alert_should_be_shown_as_Declined() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    Assert.assertEquals("Declined", TestRunner.driver.switchTo().alert().getText());
    TestRunner.driver.switchTo().alert().accept();

}

@When("The tester can clicks on Reject button of the chosen defect")
public void the_tester_can_clicks_on_Reject_button_of_the_chosen_defect() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.Tester.rejectedButton();
}   


@Then("the rejected defect alert should be shown as Rejected")
public void the_rejected_defect_alert_should_be_shown_as_Rejected() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    Assert.assertEquals("Rejected", TestRunner.driver.switchTo().alert().getText());
    TestRunner.driver.switchTo().alert().accept();
}

@When("The tester can clicks on fixed button of the chosen defect")
public void the_tester_can_clicks_on_fixed_button_of_the_chosen_defect() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.Tester.fixedButton();
}
@Then("the fixed defect alert should be shown as Fixed")
public void the_fixed_defect_alert_should_be_shown_as_Fixed() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    Assert.assertEquals("Fixed", TestRunner.driver.switchTo().alert().getText());
    TestRunner.driver.switchTo().alert().accept();
}
@When("The tester can clicks on shelved button of the chosen defect")
public void the_tester_can_clicks_on_shelved_button_of_the_chosen_defect() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.Tester.shelvedButton();
}
@Then("the shelved defect alert should be shown as Shelved")
public void the_shelved_defect_alert_should_be_shown_as_Shelved() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    Assert.assertEquals("Shelved", TestRunner.driver.switchTo().alert().getText());
    TestRunner.driver.switchTo().alert().accept();
}

}
