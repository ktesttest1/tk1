import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamal\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      driver.get("https://secure-pi.aarp.org/applications/user/login");
    WebElement email =  driver.findElement(By.id("email"));
     email.sendKeys("wrightc1@aarp.org");
     WebElement pass = driver.findElement(By.id("password"));
     pass.sendKeys("password1");
     WebElement loginb = driver.findElement(By.id("btn-login"));
     loginb.click();
     Thread.sleep(300);
     driver.navigate().to("https://secure-pi.aarp.org/applications/user/logout/logout");
      
      
	}

}
