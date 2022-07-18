import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Checkboxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "\\Users\\aduit\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		
		WebElement firstCheckbox = driver.findElement(By.id("checkBoxOption1"));
		
		firstCheckbox.click();
		if (firstCheckbox.isSelected()) {
			System.out.println("First option checkox is selected successfully");
		} else {
			System.out.println("First option checkox is not selected");
		}
		
		firstCheckbox.click();
		if (!firstCheckbox.isSelected()) {
			System.out.println("First option checkox is not selected successfully");
		} else {
			System.out.println("First option checkox is selected");
		}
		
		List <WebElement> options = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("Number of checkboxes present on page = " + options.size());
		
		driver.close();
	}

}
