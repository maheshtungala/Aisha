package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstProgram {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			        "D:\\tet\\chrome\\chromedriver.exe");
	
	//ChromeDriver driver = new ChromeDriver();

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.google.com");

   driver.close();

	}

}
