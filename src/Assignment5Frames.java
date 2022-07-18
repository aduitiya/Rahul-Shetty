import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Assignment5Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "\\Users\\aduit\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(text(), 'Multiple Windows')]")).click();
		driver.findElement(By.cssSelector(".example a")).click();
		
		Set <String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		
//		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			       .withTimeout(Duration.ofSeconds(10))
//			       .pollingEvery(Duration.ofSeconds(2))
//			       .ignoring(NoSuchElementException.class);
//
//			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//			     public WebElement apply(WebDriver driver) {
//			       return driver.findElement(By.cssSelector(".example h3"));
//			     }
//			   });
			   
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
	}

}
