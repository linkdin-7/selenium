package co.selenium.webdriver.basic;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Automation {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver", "E:\\java_sel\\sele_jdemo\\driver\\chromedriver.exe");  
         
         // Instantiate a ChromeDriver class.     
         WebDriver driver=new ChromeDriver();  
         
         driver.navigate().to("https://www.Pagalguy.com/");
         
         driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
         
         
         java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
    
         System.out.println("The number of links is" + links.size());
         int linkcount = links.size();
      
         java.util.List<String> hrefs = new ArrayList<String>();
         for(WebElement link:links){
        	 hrefs.add(link.getAttribute("href"));
        	 }
         for ( String href : hrefs ) {
        	    driver.get(href);
        	   System.out.println(href);
        	}

       driver.close();
		

	}
	

}
