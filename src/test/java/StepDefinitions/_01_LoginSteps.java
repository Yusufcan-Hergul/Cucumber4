package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to basqar")
    public void navigate_to_basqar() throws InterruptedException {

        GWD.getDriver().get("https://demo.mersys.io/");
       GWD.getDriver().manage().window().maximize();

    }
    @When("Enter username and passwoed and click login button")
    public void enter_username_and_passwoed_and_click_login_button(){

        dc.username.sendKeys("richfield.edu");
        dc.password.sendKeys("Richfield2020!");
        dc.loginbutton.click();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        Assert.assertTrue(dc.dashboard.getText().contains("Dashboard"));

    }
}
