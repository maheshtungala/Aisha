package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("http://apps.qaplanet.in/qahrm");
        
        //create a webelement for the username field
        WebElement UN = driver.findElement(By.name("txtUserName"));
        
        //enter some text into the username field
        UN.sendKeys("fdwew");
        Thread.sleep(3000);
        
        UN.clear();
        
        Thread.sleep(3000);
        UN.sendKeys("qaplanet1");

	}

}
