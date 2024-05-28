package testsuite;
/*
Write down the following test into ‘ForgotPasswordTest’ class
1. userShouldNavigateToForgotPasswordPageSuccessfully
* click on the ‘Forgot your password’ link
* Verify the text ‘Reset Password’
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setUp() {
        openbrowser(baseUrl);

    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']")).click();
        //Verify the text ‘Reset Password’
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//button[@type='submit']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
