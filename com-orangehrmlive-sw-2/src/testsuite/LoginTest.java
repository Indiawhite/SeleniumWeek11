package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setupTest() {openBrowser(baseUrl);

    }
    @Test
    public void Login(){
        WebElement username = driver.findElement(By.name("username"));
       username.sendKeys("Admin");
       //username.click();

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        //password.click();

        WebElement login = driver.findElement(By.xpath("//*[@id=app]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        login.click();
    }
}