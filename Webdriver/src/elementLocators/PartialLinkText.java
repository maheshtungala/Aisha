package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//click the gmail link
		driver.findElement(By.partialLinkText("ma")).click();
		
		//print the current url
		System.out.println(driver.getCurrentUrl());

	}

}
