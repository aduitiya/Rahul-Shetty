import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3Wait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int j = 0;
		System.setProperty("webdriver.chrome.driver", "\\Users\\aduit\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//*[@value='user']//parent::label//span[@class='checkmark']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.xpath("//*[@id='okayBtn']")).click();
		
		Select dropdown = new Select(driver.findElement(By.cssSelector("select.form-control")));
		dropdown.selectByValue("consult");
		
		driver.findElement(By.cssSelector("[id='terms']")).click();
		driver.findElement(By.cssSelector("[id='signInBtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("app-card-list.row")));
		
		List <String> itemsNeeded =  Arrays.asList("iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry");
		
		List <WebElement> itemsPresent = driver.findElements(By.cssSelector(".card-title"));
		
		for (int i = 0; i < itemsPresent.size(); i++) {
			
			String itemName = itemsPresent.get(i).getText();
			
			if (itemsNeeded.contains(itemName)) {
				j++;
				driver.findElements(By.xpath("//*[contains(text(), 'Add')]")).get(i).click();
			}
			
			if (j == itemsNeeded.size()) 
				break;
		}
		
		driver.findElement(By.xpath("//*[contains(text(), 'Checkout')]")).click();
	}

}
