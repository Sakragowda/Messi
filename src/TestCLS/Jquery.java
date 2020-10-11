package TestCLS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery {

	public static void main(String[] args) {             //     10 / 10 / 2020
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.jqueryui.com/slider/");			
		
	}

}
