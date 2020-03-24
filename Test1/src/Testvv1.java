import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testvv1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamal\\Desktop\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      
	      driver.get("https://test.daestark.com/");
	      WebElement user = driver.findElement(By.xpath("//*[@id='username']"));
	      user.sendKeys("user1");
	      WebElement user1 = driver.findElement(By.xpath("//*[@id='password']"));
	      user1.sendKeys("password");
	      
	      WebElement lb = driver.findElement(By.xpath("//*[@id='submit']/td[3]/button"));
	      lb.click();
	      
	      WebElement ca = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/section/div/app-dashboard/mat-drawer-container/mat-drawer-content/div/div/app-activities-bar/mat-card/mat-card-content/span/mat-grid-list/div/mat-grid-tile[1]/figure/div/button/span"));
	      ca.click();
	      
	      WebElement team = driver.findElement(By.xpath("//*[@id='mat-select-4']/div/div[1]/span"));
	      Thread.sleep(1000);
	      team.click();
	      
	      WebElement teamd = driver.findElement(By.xpath("//*[@id='mat-option-28']/span"));
	      teamd.click();
	     
	      /*
	    
	      WebElement rs1 = driver.findElement(By.xpath("//mat-select[@id='mat-select-2']/div/div/span"));
	     // WebElement rs1 = driver.findElement(By.cssSelector("mat-select-value > .ng-tns-c42-29"));
	      Thread.sleep(100000);
	     String cc= rs1.getAttribute("class");
	     System.out.println(cc);
	      rs1.click();
	      */
	      
	    
	}

}
