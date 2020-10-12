package TestCLS;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class yatra {

	public static void main(String[] args) throws InterruptedException ,ClassCastException {            //     10 / 10 / 2020
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );  
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--disable-notifications");
		  
	      WebDriver driver = new ChromeDriver(co);
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.yatra.com/");	
	      Thread.sleep(20000);
	      
	      driver.findElement(By.xpath("//button[text()='Ok,I Agree']")).click();           // cookies
	      
	      
		  Actions a = new Actions(driver);
		  
		  //Board
		  WebElement depart = driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']"));
		  a.moveToElement(depart).build().perform();
		  depart.click();
		  Thread.sleep(3000);
		  WebElement dpslt = driver.findElement(By.xpath("//p[text()='Kempegowda International']/parent::div[@class='ac_airport']"));
          dpslt.click();
	      
	      WebElement deboard = driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']"));    // De=board
	      a.moveToElement(deboard).build().perform();
	      deboard.click();
	      Thread.sleep(3000);
	      WebElement dsslt = driver.findElement(By.xpath("//p[text()='Dabolim']/parent::div[@class='ac_airport']"));
	      dsslt.click();
	      
	      // Date
	      driver.findElement(By.xpath("//input[@class=\"custom-date-input BE_flight_origin_date\"]")).click();   
	      Thread.sleep(1000);
	      
	      System.out.print("Enter the booking date :");
	      int b = s.nextInt();
	      driver.findElement(By.xpath("//td[@data-date=\""+b+"/10/2020\"]")).click();           // Booking Date
	      
	            driver.findElement(By.xpath("//input[@name='flight_destination_date']")).click();
	            Thread.sleep(2000);
				System.out.print("Enter the return date :");
				int c = s.nextInt();
				driver.findElement(By.xpath("//td[@data-date='"+c+"/10/2020']")).click();             //    Return date 
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		   WebElement drop = driver.findElement(By.xpath("//i[@class='icon icon-angle-right arrowpassengerBox']"));	// drop down
		   a.moveToElement(drop).perform();
	       drop.click();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//span[@id=\"adultPax\"]/parent::span/following-sibling::div/div/span[@class='ddSpinnerPlus']")).click();  // Adult select
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//span[@id=\"childPax\"]/parent::span/following-sibling::div/div/span[@class='ddSpinnerPlus']")).click();  // child select 
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//span[@id=\"infantPax\"]/parent::span/following-sibling::div/div/span[@class='ddSpinnerPlus']")).click();  // infantpax
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//span[text()='Premium Economy']")).click();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   WebElement nonstop = driver.findElement(By.xpath("//a[@title='Non Stop Flights']"));
		   nonstop.click();
		   System.out.println(nonstop.getText());
		   
	      
	          
	}

}
