import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.setProperty("webdriver.gecko.driver","/Users/mirallakhani/Downloads/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.youtube.com/");

		System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.youtube.com/");
		
		// Instantiate a SafariDriver class. 
//		WebDriver driver1 = new SafariDriver(); 
//		// Launch Website 
//		driver1.get("https://www.youtube.com/");
//		driver1.navigate().to("http://www.google.com/"); 
//
//		// Click on the search text box and send value 
//		driver1.findElement(By.id("lst-ib")).sendKeys("BrowserStack"); 
//
//		// Click on the search button 
//		driver1.findElement(By.name("btnK")).click(); 

		// Close the Browser 
		//driver1.close();
		
		
		
		//WebDriver driver = new SafariDriver(); 
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		//get title
        String title = driver.getTitle();
        assertEquals("Web form", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value);

        //driver.quit();

	}

	private static void assertEquals(String string, String title) {
		// TODO Auto-generated method stub
		
	}

}
