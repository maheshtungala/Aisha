package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWait = new WebDriverWait(driver,10);
		
		driver.get("http://apps.qaplanet.in/qahrm");
		
		//wait until  username field is visible
		myWait.until(ExpectedConditions.visibilityOfElementLocated
				                             (By.name("txtUserName")));
				
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		
		myWait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		driver.findElement(By.name("Submit")).click();
		
		
		//wait until the page title is OrangeHRM
		myWait.until(ExpectedConditions.titleIs("OrangeHRM"));
		//verify the page title
		if(driver.getTitle().equals("OrangeHRM")){
			System.out.println("TC passed!");
		}else{
			System.out.println("TC failed!");
		}
		
		//logout
		driver.findElement(By.linkText("Logout")).click();
		
		//close the browser
		driver.close();

	}

}
