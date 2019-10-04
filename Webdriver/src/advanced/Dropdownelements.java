package advanced;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownelements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		List<WebElement> dd =  driver.findElements(By.name("country"));
		
		//use the iterator interface..
		Iterator itr = dd.iterator();
		while(itr.hasNext()){
			WebElement w = (WebElement) itr.next();
			System.out.println(w.getText());
		}
      driver.close();

	}

}
