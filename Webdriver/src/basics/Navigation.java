package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws Exception  {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
		//click the gmail link
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(3000);
		//click the back
		driver.navigate().back();
		
		Thread.sleep(3000);
		//click the forward
		driver.navigate().forward();
		
		Thread.sleep(3000);
		//click the refresh
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		//maximize the window
		driver.manage().window().maximize();
		
		

	}

}
