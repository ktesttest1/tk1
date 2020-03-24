import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seltest1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://www.orbitz.com/");
    
    WebElement trips = driver.findElement(By.xpath("//*[@id='header-itineraries']"));
    
   String tripstag=  trips.getTagName();
   System.out.println(tripstag);
   String tripstext = trips.getText();
   
   System.out.println(tripstext);
   
   System.out.println(trips.isDisplayed());
    
   Point tripspoint =  trips.getLocation();
    
    System.out.println("x coordinate is " + tripspoint.x + "y coordinate is " + tripspoint.y);
    
    WebElement datefield = driver.findElement(By.xpath("//*[@id='package-origin-hp-package']"));
    
   Dimension datefieldd =  datefield.getSize();
   System.out.println("width is is " + datefieldd.width+ "ht is  " + datefieldd.height);
   
   // driver.navigate().refresh();
   // driver.navigate().back();
   // driver.navigate().forward();
    /*
    String atitle = driver.getTitle();
    System.out.println(atitle);
    String etitle ="Facebook - Log In or Sign Up";
    
    /*
    if(etitle.equals(atitle)) {
    	System.out.println("TC1 is pass");
    }
    else
    {
    	System.out.println("TC1 is fail");
    }
    
    String actualcurl = driver.getCurrentUrl();
    System.out.println(actualcurl);
    
   String actualpagesource = driver.getPageSource();
   //System.out.println(actualpagesource);
   String meta = "og:url";
  if( actualpagesource.contains(meta)){
	  System.out.println("TC2 is pass as it contains the meta property");
  }
  else
  {
	  System.out.println("TC2 is fail as it does not contains the meta property");
  }
  
  //WebElement email = driver.findElement(By.name("email"));
 // WebElement email = driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
//  WebElement falink = driver.findElement(By.linkText("Forgot account?"));
 // WebElement falink = driver.findElement(By.partialLinkText("Forgot"));
  //falink.click();
 List<WebElement> links = driver.findElements(By.tagName("a"));
 for(WebElement link : links) {
	 System.out.println(link.getAttribute("href"));
 }
 
 */
// WebElement email = driver.findElement(By.id("email"));
 
 // email.sendKeys("jkhjkhk");
 // email.clear();
    
    /*
    
    WebElement falink = driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a"));
    String link = falink.getAttribute("href");
    
    System.out.println(link);
    String alinkcssvalue = falink.getCssValue("font-size");
    falink.click();
    System.out.println(alinkcssvalue);
    
    */
    
   
  
   
    //closes the current window that it is controlling
   // driver.close();
    
    //quit closes all the windows that selenium opend at that instance
    //driver.quit();
	}

}
