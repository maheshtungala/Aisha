package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\tet\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///E:/Mahesh/Html/QAPlanet.html");
		
		//get the innertext of the 2nd row 2nd col absolute xpath
	/*	String text = driver.findElement(By.xpath
				("//html/body/table/tbody/tr[2]/td[2]")).getText();  */
		
		//using relative xpath
	/*	String text = driver.findElement(By.xpath
				("//table/tbody/tr[2]/td[2]")).getText();   */
		
		String text = driver.findElement(By.xpath
				       ("//*[@id='Table1']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		driver.close();

	}

}
