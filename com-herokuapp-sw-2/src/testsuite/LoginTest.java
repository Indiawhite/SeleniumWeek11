package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest extends BaseTest {

String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setupTest() {openBrowser(baseUrl);
    }


    @Test
    public void login(){
        //1.UserSholdLoginSuccessfullyWithValidCredentials

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("tomsmith");
        userName.click();

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");
        password.click();

       driver.findElement(By.xpath("//button[@class='radius']")).click();

        //2.verifyTheUsernameErrorMessage
        /*WebElement userNameError = driver.findElement(By.name("username"));
        userNameError.sendKeys("tomsmith1");
        userNameError.click();

        WebElement passwordIcon = driver.findElement(By.name("password"));
        passwordIcon.sendKeys("SuperSecretPassword!");
        passwordIcon.click();

        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sing-in']")).click();


        //3. verifyThePasswordErrorMessage
        WebElement userNameIcon = driver.findElement(By.name("username"));
        userNameIcon.sendKeys("tomsmith");
        userNameIcon.click();

        WebElement passwordError = driver.findElement(By.name("password"));
        passwordError.sendKeys("SuperSecretPassword");
        passwordError.click();

        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sing-in']")).click();*/
    }

}
