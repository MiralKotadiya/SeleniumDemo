import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AmazoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new SafariDriver(); 
		System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.ca/");
        WebElement s1 = driver.findElement(By.id("twotabsearchtextbox"));
        s1.sendKeys("Iphone X");
        s1.submit();
        //driver.findElement(By.linkText("Apple iPhone Xs Max, US Version, 64GB, Space Gray - Unlocked (Renewed)")).click();
	}

}
