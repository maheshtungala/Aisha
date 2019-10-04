package pageelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tooltip {
public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement Search = driver.findElement(By.name("q"));
		
		System.out.println("the tooltip of Searchbox is " + 
		                            Search.getText());
	}

}
