package advanced;
import java.io.File;
import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//capture the screenshot first
		File obj =((TakesScreenshot)driver).getScreenshotAs
				                    (OutputType.FILE);
		
		//copy the screenshot into a file
		FileUtils.copyFile(obj, new File("E:\\mahesh.jpg"));

	}

}
