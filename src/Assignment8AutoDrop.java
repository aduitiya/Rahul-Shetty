import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8AutoDrop {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "\\Users\\aduit\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
			
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Ind");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(text(), 'India')])[2]")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".ui-autocomplete-input")).getAttribute("value"));
	}

}
