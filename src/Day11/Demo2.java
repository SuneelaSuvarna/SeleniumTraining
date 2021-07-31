package Day11;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/ActionDemo.html");
		// driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("A2")).click();
		Thread.sleep(1000);
		String xpath1 = "//span[text()='right click me']";
		WebElement rightClick = driver.findElement(By.xpath(xpath1));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Quit']")).click();

	}

}
