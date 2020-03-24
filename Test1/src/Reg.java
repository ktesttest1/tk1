import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reg {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.get("https://secure-pi.aarp.org/applications/user/register");
		  String e="tes00tt70770700077@aarp.org";
		 WebElement email = driver.findElement(By.id("registeremail"));
		 email.sendKeys(e);
		 WebElement cemail = driver.findElement(By.id("emailConfirm"));
		cemail.sendKeys(e);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("password1");
		WebElement fn = driver.findElement(By.id("firstName"));
		fn.sendKeys("test");
		WebElement ln = driver.findElement(By.id("lastName"));
				ln.sendKeys("test");
				WebElement zip = driver.findElement(By.id("postalCode"));
				zip.sendKeys("67609");
				WebElement dmonth = driver.findElement(By.id("dob_month"));
				WebElement dday = driver.findElement(By.id("dob_date"));
				
				Select dob = new Select((dmonth));
				dob.selectByValue("09");
				Select dobd = new Select(dday);
				dobd.selectByValue("19");
				
				Thread.sleep(4000);
				
				WebElement tos = driver.findElement(By.id("tos"));
				tos.click();
				WebElement btn = driver.findElement(By.id("submit-btn"));
				btn.click();
				 driver.navigate().to("https://secure-pi.aarp.org/applications/user/logout/logout");
				 driver.quit();
				 
				
				
				
				
		
		  

	}

}
