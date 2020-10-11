package TestCLS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra {

	public static void main(String[] args) throws InterruptedException {            //     10 / 10 / 2020
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.yatra.com/");	
	      Thread.sleep(20000);
	      
	      Alert al =   driver.switchTo().alert();
	      al.accept();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	      driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).click();
	      driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).click();
	      
	      
	      
	      
	     
	      
	}

}
