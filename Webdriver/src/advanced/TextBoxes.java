package advanced;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Mahesh/Html/cssform.html");
		
		List<WebElement> tb =  driver.findElements(By.tagName("input"));
		
		//use the iterator interface..
		Iterator itr = tb.iterator();
		while(itr.hasNext()){
			WebElement w = (WebElement) itr.next();
			w.sendKeys("hello");
		}
      //driver.close();
	

	}

}
