import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment {
public static void main(String[] args) {
	String name="Neha";
	System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32_79//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.name("enter-name")).sendKeys(name);
	driver.findElement(By.cssSelector("[id='alertbtn']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.findElement(By.id("confirmbtn")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	
}
}
