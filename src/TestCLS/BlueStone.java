package TestCLS;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) {             //     10 / 10 / 2020
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.bluestone.com/");	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    
	    driver.findElement(By.xpath("//li[@class='store-block']")).click();
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);
			
		}
		System.out.println(driver.findElement(By.xpath("//div[text()='Pacific Mall, New Delhi']/parent::div")).getText());
		driver.findElement(By.xpath("//div[text()='Pacific Mall, New Delhi']/parent::div/following-sibling::div[@class='col-xs-3']")).click();

		
		
	}

}
