package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		        "D:\\tet\\chrome\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//get the count of the links
		int linkCount = driver.findElements(By.tagName("a")).size();

	    System.out.println(linkCount);


	}

}
