package pageelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("http://apps.qaplanet.in/qahrm");
        
        //enter some text into the username field
        driver.findElement(By.name("txtUserName")).sendKeys("fdwew");
        Thread.sleep(3000);
        
        driver.findElement(By.name("txtUserName")).clear();
        
        Thread.sleep(3000);
        driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	}

}
