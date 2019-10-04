package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		        "D:\\tet\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//enter the email using id
		//driver.findElement(By.id("email")).sendKeys("maheshtungala");
		
		//use the name locator
		driver.findElement(By.name("email")).sendKeys("maheshtungala");
	}

}
