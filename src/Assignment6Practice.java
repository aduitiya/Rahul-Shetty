import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\aduit\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkBoxOption1")).click();
		String checkboxText = driver.findElement(By.xpath("//*[@id='checkBoxOption2']//parent::label")).getText();
		System.out.println("Selected checkbox text = " + checkboxText);
		WebElement dropdownID = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(dropdownID);
		dropdown.selectByVisibleText(checkboxText);
		driver.findElement(By.id("name")).sendKeys(checkboxText);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
		
		if (alertText.equalsIgnoreCase(checkboxText)) {
			System.out.println(checkboxText + " is present in the alert box text");
		} else {
			System.out.println(checkboxText + " is not present in the alert box text");
		}
		
		driver.switchTo().alert().accept();
		driver.close();
	}
}
