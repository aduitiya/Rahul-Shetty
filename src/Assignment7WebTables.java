import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "\\Users\\aduit\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,700)");
		
		List <WebElement> rows = driver.findElements(By.xpath("//*[@name='courses']//tr"));
		int num_rows = rows.size();
		System.out.println("Total number of rows in the web table = " + num_rows);
		
		List <WebElement> columns = driver.findElements(By.xpath("//*[@name='courses']//tr/th"));
		int num_columns = columns.size();
		System.out.println("Total number of columns in the web table = " + num_columns);
		
		List <WebElement> secondRow = driver.findElements(By.xpath("//*[@name='courses']//tr[3]/td"));
		
		for (int i = 0; i < secondRow.size(); i++) {
			System.out.println(secondRow.get(i).getText().trim());
		}
	}

}
