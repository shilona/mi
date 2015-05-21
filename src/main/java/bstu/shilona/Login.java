package bstu.shilona;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login
{
    private WebDriver driver;
 
    public Login(WebDriver driver) {
        this.driver = driver;		
    }
	
	public void SignIn(String user, String pass)
	{
		driver.get("https://github.com/login");
		WebElement loginField = driver.findElement(By.xpath("//*[@id=\"login_field\"]")); 
		loginField.sendKeys(user);
		WebElement passField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passField.sendKeys(pass);
		passField.submit();
	}
}
