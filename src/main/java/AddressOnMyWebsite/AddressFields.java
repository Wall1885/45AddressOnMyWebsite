package AddressOnMyWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddressFields {

    public WebDriver driver;

    @BeforeTest(description = "This is to test the URL is called")
    void StartBrowser () {
        String projectPath;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/2AutomationForm/1Form.html");
    }

    @Test(priority = 1, description = "This is to test the Address1 field has had data entered")
    void TestOne () {
        WebElement address1 = driver.findElement(By.name("address1"));
        address1.sendKeys("48");
        System.out.println("Address1 has been entered");
    }
    @Test(priority = 2, description = "This is to test the Address2 field has had data entered")
    void TestTwo () {
        WebElement address2 = driver.findElement(By.name("address2"));
        address2.sendKeys("Lincoln Road");
        System.out.println("Address2 has been entered");
    }
    @Test(priority = 3, description = "This is to test the County field has had data entered")
    void TestThree () {
        WebElement county = driver.findElement(By.name("county"));
        county.sendKeys("Ipswitch");
        System.out.println("County has been entered");
    }
    @Test(priority = 4, description = "This is to test the Post Code field has had data entered")
    void TestFour () {
        WebElement postcode = driver.findElement(By.name("postcode"));
        postcode.sendKeys("I1 6NS");
        System.out.println("Post Code has been entered");
    }
    @Test(priority = 5, description = "This is to test the Country field has had data entered")
    void TestFive () {
        WebElement country = driver.findElement(By.name("country"));
        country.sendKeys("England");
        System.out.println("Country has been entered");
    }
    @Test(priority = 6, description = "This is to test the Date of Birth field has had data entered")
    void TestSix () {
        WebElement date_of_birth = driver.findElement(By.name("date_of_birth"));
        date_of_birth.sendKeys("11111981");
        System.out.println("Date of Birth has been entered");
    }
    @Test (priority = 7, description = "This is to test the Send key has been clicked")
    void TestSeven () {
        By.xpath("//input[@id='send']").findElement(driver).click();
        System.out.println("Submit has been pressed");
    }
    @Test (priority = 8, description = "This is to test that the browser closes")
    void TestEight () {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement database = driver.findElement(By.xpath("//*[text()='Your details have been received successfully']"));
        Assert.assertTrue(database.isDisplayed());
        System.out.println("Your details have been received successfully is displayed on the screen");
    }
    @Test(priority = 9, description = "To check that the Details have been sent to the Database")
    void TestNine() {
        driver.manage().deleteAllCookies();
        driver.close();
        System.out.println("Test has passed");
        }
}
