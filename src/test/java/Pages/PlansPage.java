package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Base.BaseClass.driver;

public class PlansPage {

    public WebElement planTitle(String plan) {
        return driver.findElement(By.id("name-" + plan));
    }

    public WebElement planCurrency(String plan) {
        return driver.findElement(By.id("currency-" + plan));
    }

    public WebElement planPrice(String plan) {
        return driver.findElement(By.xpath("//*[@id=\"currency-" + plan + "\"]/b"));
    }

//    public WebElement classicTitle() {
//        return driver.findElement(By.id("name-classic"));
//    }
//
//    public WebElement classicCurrency() {
//        return driver.findElement(By.id("currency-classic"));
//    }
//
//    public WebElement classicPrice() {
//        return driver.findElement(By.xpath("//*[@id=\"currency-classic\"]/b"));
//    }
//
//    public WebElement premiumTitle() {
//        return driver.findElement(By.id("name-premium"));
//    }
//
//    public WebElement premiumCurrency() {
//        return driver.findElement(By.id("currency-premium"));
//    }
//
//    public WebElement premiumPrice() {
//        return driver.findElement(By.xpath("//*[@id=\"currency-premium\"]/b"));
//    }
//
}
