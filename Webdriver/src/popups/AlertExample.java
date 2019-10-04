package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		//click on the login button
		driver.findElement(By.name("Submit")).click();
		
		//alert comes up
		Alert al = driver.switchTo().alert();
		
		//fetch the innertext of the alert
		String text = al.getText();
		System.out.println(text);
		
		//click the ok button
		al.accept();
		
		System.out.println(driver.getCurrentUrl());

	}

}
