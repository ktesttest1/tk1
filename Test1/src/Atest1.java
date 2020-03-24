import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamal\\Downloads\\chromedriver_win32-78\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    driver.get("https://aarp.org/caregiving/basics/info-2017/caregiving-quiz.html#quest1");
	    
	   // driver.findElement(By.xpath(xpathExpression))
	    
	    WebElement badge = driver.findElement(By.xpath("//*[@id='rewards-badge']"));
	    System.out.println(badge.isDisplayed());
	    WebElement bagdetitle = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[1]/div/div[1]//img"));
	    System.out.println(bagdetitle.getAttribute("title"));

	}

}
