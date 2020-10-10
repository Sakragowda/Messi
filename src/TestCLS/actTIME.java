package TestCLS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actTIME {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://demo.actitime.com/login.do");	
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.id("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("loginButton")).click();
	      Thread.sleep(3000);		
	      
	      driver.findElement(By.xpath("//div[@class=\"popup_menu_icon\"]/parent::div[@class='popup_menu_button popup_menu_button_tips']")).click();
	      Thread.sleep(3000);
	      
	      WebElement ele = driver.findElement(By.xpath("//td[@style='vertical-align: top; padding: 4px 0 20px 0; height: 16px;']"));
	      Thread.sleep(2000);
	      
	      System.out.println(ele.getText());
		
	}

}
