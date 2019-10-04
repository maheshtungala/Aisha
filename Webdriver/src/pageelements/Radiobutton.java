package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

		//login
		driver.findElement(By.name("userName")).sendKeys("mahesh");
		driver.findElement(By.name("password")).sendKeys("mahesh");
		driver.findElement(By.name("login")).click();
		
		//create a webelement for the radiobutton oneway
		WebElement oneway = driver.findElement(By.xpath("//input[@value='oneway']"));
		
		oneway.click();
		if(oneway.isSelected()){
			System.out.println("the radiobutton is selected!");
		}else{
			System.out.println("the radiobutton is not selected!");
		}
		

	}

}
