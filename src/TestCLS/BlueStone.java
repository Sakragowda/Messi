package TestCLS;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.bluestone.com/");	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    
	    driver.findElement(By.xpath("//li[@class='store-block']")).click();
	    List<WebElement> ele = driver.findElements(By.xpath("//div[@class='get-direction']/a[@target='_blank']"));
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);
			for (WebElement el : ele) {
				el.click();
				System.out.println(e1.getText());
			}
		}
	}

}
