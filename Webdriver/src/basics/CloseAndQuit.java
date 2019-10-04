package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		        "D:\\tet\\chrome\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		//driver.close();
		driver.quit();
	}

}
