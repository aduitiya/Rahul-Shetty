import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment4WindowsHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "\\Users\\aduit\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[contains(text(), 'Nested Frames')]/parent::li"))));
		driver.findElement(By.xpath("//*[contains(text(), 'Nested Frames')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//frame"))));

		WebElement topFrame = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topFrame);
		
		System.out.println("Number of sub frames = " + driver.findElements(By.xpath("//frame")).size());
//		driver.switchTo().frame(1);
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.close();
	}

}
