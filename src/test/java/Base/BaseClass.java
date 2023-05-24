package Base;

import Pages.NavBar;
import Pages.PlansPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseClass {
    public static ChromeDriver driver;
    public static SoftAssert softAssert;

    public static NavBar navBar;
    public static PlansPage plansPage;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--headless"); // comment to see chrome interaction
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        softAssert = new SoftAssert();
        driver.manage().window().maximize();
        navBar = new NavBar();
        plansPage = new PlansPage();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
