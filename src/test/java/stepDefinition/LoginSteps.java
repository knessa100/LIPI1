package stepDefinition;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObject.login_page;

public class LoginSteps extends Config {
      login_page lp = new login_page(driver);
   
    @Given("user should be on TalentTEK homepage")
    public void userShouldBeOnTalentTEKHomepage() {

        //verify page title
        String act = driver.getTitle();
        String exp = "Sign In";
        Assert.assertEquals(act, exp);

    }


    @And("User enter valid email address")
    public void userEnterValidEmailAddress() {
        //qa.env1@gmail.com / Test1234
      lp.enterEmailAddress(Email_Address);
    }


    @And("User enter valid password")
    public void userEnterValidPassword() {
        lp.enterPassword("Password");

    }

    @When("User clicks on Log In button")
    public void userClicksOnLogInButton() {
        lp.clickOnLogInButton();
    }

    @Then("User should be able to successfully login")
    public void userShouldBeAbleToSuccessfullyLogin() {
    }


    @And("User enter invalid password")
    public void userEnterInvalidPassword() {
    }

    @Then("User should be able see {string}")
    public void userShouldBeAbleSee(String arg0) {
    }

    @And("User enter invalid email address")
    public void userEnterInvalidEmailAddress() {
    }

    @Given(" user should be on TalentTEK homepage")
    public void UserShouldBeOnTalentTEKHomepage() {
    }

    @Then("User should be able to see {string}")
    public void userShouldBeAbleToSee(String arg0) {
    }


    @Given("User in TalentTEK homepage")
    public void userInTalentTEKHomepage() {
    }

    public String getAct() {

        return null;
    }

    public String getExp() {


        return null;
    }
}