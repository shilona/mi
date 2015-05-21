package bstu.shilona;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	/*экземпляр логгера*/
	private static final Logger logger = LogManager.getLogger(AppTest.class);
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        logger.info("Тест!");
		WebDriver driver = new FirefoxDriver();              
		
		
		Login loginPage = new Login(driver);
		
		loginPage.SignIn("shilona","shilona94");

		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[1]/a/span/span"));
		String userName = element.getText();
		logger.info("пользователь: " + userName);
		Assert.assertTrue(userName.equals("shilona"));			
     
        
    }
}
