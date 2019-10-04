package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		        "D:\\tet\\chrome\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//enter selenium into the searchbox
		driver.findElement(By.className("gLFyf")).sendKeys("selenium");

	}

}
