package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

import static Base.BaseClass.*;

public class Steps {

    @Given("User navigates to base URL")
    public void navigateToURL() {
        driver.navigate().to("https://subscribe.stctv.com/sa-en");
    }

    @When("User clicks on country selector")
    public void countrySelector() {
        navBar.countryBtn().click();
    }

    @And("^User selects (.*)$")
    public void selectsACountry(String country) {
        navBar.countryFlag(country).click();
    }


    @Then("^User should be navigated to (.*) URL$")
    public void assertURL(String country) {
        softAssert.assertTrue(driver.getCurrentUrl().contains(country));
    }

    @And("^User should see (.*) flag$")
    public void assertSaudiFlag(String country) {
        softAssert.assertTrue(navBar.flag().getAttribute("alt").contains(country));
    }

    @And("User should see plans of (.*), (.*) and (.*)$")
    public void assertPlans(String plan1, String plan2, String plan3) {
        softAssert.assertTrue(plansPage.planTitle(plan1).isDisplayed());
        softAssert.assertTrue(plansPage.planTitle(plan2).isDisplayed());
        softAssert.assertTrue(plansPage.planTitle(plan3).isDisplayed());
    }

    @And("^User should see prices as (.*) for (.*), (.*) for (.*) and (.*) for (.*)$")
    public void assertPrices(String plan1Price, String plan1, String plan2Price, String plan2, String plan3Price, String plan3) {
        softAssert.assertTrue(plansPage.planPrice(plan1).getText().contains(plan1Price));
        softAssert.assertTrue(plansPage.planPrice(plan2).getText().contains(plan2Price));
        softAssert.assertTrue(plansPage.planPrice(plan3).getText().contains(plan3Price));
    }

    @And("^User should see a currency of (.*) for plans (.*), (.*) and (.*)$")
    public void assertCurrency(String currency, String plan1, String plan2, String plan3) {
        softAssert.assertTrue(plansPage.planCurrency(plan1).getText().contains(currency));
        softAssert.assertTrue(plansPage.planCurrency(plan2).getText().contains(currency));
        softAssert.assertTrue(plansPage.planCurrency(plan3).getText().contains(currency));
    }

    @And("^Take a screenshot for (.*) page$")
    public void takeScreenShot(String country) {
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        String savedScreen = System.getProperty("user.dir") + "\\screenshots\\";
        try {
            FileUtils.copyFile(screenshot, new File(savedScreen + country + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        softAssert.assertAll();
    }
}
