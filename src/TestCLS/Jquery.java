package TestCLS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args) throws InterruptedException {             //     10 / 10 / 2020
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window

	      driver.get("https://jqueryui.com/slider/");       // SLIDER URL
	      
	      WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	      driver.switchTo().frame(frame);	    
		
		  Actions a = new Actions(driver);
		  WebElement slider = driver.findElement(By.id("slider"));    //    SLIDER
		  int b=0;
		  for (int i = 0; i <= 30 ; i++) {
			if(i<=15)
			{
				a.dragAndDropBy(slider, b , 0 ).perform();
				Thread.sleep(1000);
				b = b + 15 ;
			}
			else
			{
				a.dragAndDropBy(slider, b , 0 ).perform();
				Thread.sleep(1000);
				b = b - 15 ;
			}
		}
		 
		  
	}

}
