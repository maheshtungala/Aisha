package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("http://apps.qaplanet.in/qahrm");
        
        //create a webelement for the username field
        WebElement UN = driver.findElement(By.name("txtUserName"));
        
        //check if UN is displayed or not..
        if(UN.isDisplayed()){
        	System.out.println("The username field is displayed");
        }else{
        	System.out.println("The username field is not displayed!");
        }
       driver.close();
	}

}
