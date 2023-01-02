package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Browser {

public static void main(String args[]) {
	
	String drivepath = "C:\\Selenium_Coding_Ducat\\seleniumm.javaaaa\\selenium_driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",drivepath);  // in property define two things- key and values.
	WebDriver browser = new ChromeDriver();  // all functions are operate  in selenium through the WebDriver.
	System.out.println(browser);
    

}
	
	
	
	
}
