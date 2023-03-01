package stepDefinition;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignupSteps extends Config {
    @Given("user in TalentTEK Homepage")
    public void userInTalentTEKHomepage() {
        //Verify title
        String title = driver.getTitle();
        Assert.assertEquals(title, "Sign In");
    }

    @And("when user click on the create new account button")
    public void whenWeClickOnTheCreateNewAccountButton() {
        driver.findElement(By.xpath("//*[@id='wrap']/div/div/div/a")).click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Sign Up");
        // Click on create account


    }

    @When("User enter first name")
    public void userEnterFirstName() {
        driver.findElement(By.name("First Name")).sendKeys("Kamrun");
    }

    @And("User enter last name")
    public void userEnterLastName() {
        driver.findElement(By.name("Last Name")).sendKeys("Nessa");
    }

    @And("user enter email")
    public void userEnterEmail() {
        driver.findElement(By.xpath("//*[@id=\"signup-form\"]/input[1]")).sendKeys("kn1@gmail.com");
    }

    @And("user enter password")
    public void userEnterPassword() {
        driver.findElement(By.xpath("//*[@id=\"signup-form\"]/input[2]")).sendKeys("123abc@");
    }

    @And("user enter confirm password")
    public void userEnterConfirmPassword() {
        driver.findElement(By.xpath("//*[@id='signup-form']/input[3]")).sendKeys("123abc@");
    }

    @And("user  enter birth date")
    public void userEnterBirthdate() {
        WebElement month = driver.findElement(By.name("month"));
        Select obj1 = new Select(month);
        obj1.selectByVisibleText("Jan");
        WebElement day = driver.findElement(By.name("day"));
        Select obj2 = new Select(day);
        obj2.selectByIndex(1);
        WebElement year = driver.findElement(By.name("year"));
        Select obj3 = new Select(year);
        obj3.selectByValue("1990");
    }

    @And("select gender button")
    public void selectGenderButton() {
        driver.findElement(By.id("female")).click();

    }

    @And("user select check box for term")
    public void checkBoxForTerm() {
        driver.findElement(By.id("defaultCheck1")).click();
    }

    @And("user click on create my account")
    public void clickOnCreateMyAccount() {
        driver.findElement(By.xpath("//*[@id=\"signup-form\"]/button")).click();

    }

    @Then("User should see the confirmation")
    public void userShouldSeeTheConfirmation() {
        String text = driver.findElement(By.xpath("//*[@id=\"success_message\"]/div")).getText();
        System.out.println(text);
    }





}


