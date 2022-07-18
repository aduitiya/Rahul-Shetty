import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2UI {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "\\Users\\aduit\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("Sumona");
		driver.findElement(By.name("email")).sendKeys("testEmail@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		driver.findElement(By.xpath("//*[contains(@id,'ControlSelect')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
		driver.findElement(By.cssSelector("[value='option1']")).click();
		driver.findElement(By.name("bday")).sendKeys("28-06-1992");
		driver.findElement(By.cssSelector("[value='Submit']")).click();
		System.out.println("Alert message = " + driver.findElement(By.xpath("//*[contains(@class, 'success alert')]")).getText());
//		System.out.print(" " + driver.findElement(By.xpath("//*[contains(@class, 'success alert')]/strong")).getText());
		driver.close();
	}

}
