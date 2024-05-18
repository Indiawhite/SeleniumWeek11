package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setupTest() {openBrowser(baseUrl);


    }
    @Test
    public void login(){
        WebElement forgotPassword = driver.findElement(By.className("oxd-text oxd-text--p orangehrm-login-forgot-header"));
        forgotPassword.click();

    }
}
