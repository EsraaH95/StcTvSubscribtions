package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Base.BaseClass.driver;

public class NavBar {

    public WebElement flag() {
        return driver.findElement(By.xpath("//*[@id=\"flag\"]/img"));
    }

    public WebElement countryFlag(String country) {
        return driver.findElement(By.id(country + "-contry-flag"));
    }

    public WebElement countryBtn() {
        return driver.findElement(By.id("country-btn"));
    }
}
