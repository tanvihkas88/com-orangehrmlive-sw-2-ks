package testsuite;
/*
Create the package ‘testsuite’ and create the following classes inside the ‘testsuite’ package.
1. LoginTest
2. ForgotPasswordTest
3. Write down the following test into ‘LoginTest’ class
1. userSholdLoginSuccessfullyWithValidCredentials
* Enter “Admin” username
* Enter “admin123 password
* Click on ‘LOGIN’ button
* Verify the ‘Dashboard’ text is display
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setUp() {
        openbrowser(baseUrl);

    }

    /*
    userSholdLoginSuccessfullyWithValidCredentials
    * Enter “Admin” username
    * Enter “admin123 password
    * Click on ‘LOGIN’ button
    * Verify the ‘Dashboard’ text is display
     */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Verify the ‘Dashboard’ text is display
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//a[@href='/web/index.php/dashboard/index']\n")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
