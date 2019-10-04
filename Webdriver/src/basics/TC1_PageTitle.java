package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_PageTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		        "D:\\tet\\chrome\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();

         driver.get("https://www.google.com");
         
      /*   String expTitle = "Google";
         
         String actTitle = driver.getTitle();
         
         //compare the titles..
         if(actTitle.equals(actTitle)){   */
         
         if(driver.getTitle().equals("Google")){
        	 System.out.println("TC passed!");
         }else{
        	 System.out.println("TC failed!");
         }
         driver.close();

	}

}
