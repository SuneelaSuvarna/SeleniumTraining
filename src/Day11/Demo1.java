package Day11;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

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

		driver.findElement(By.id("A1")).click();

		Thread.sleep(1000);

		String xpath1 = "(//a[text()='About us '])[2]";
		WebElement aboutUsEle = driver.findElement(By.xpath(xpath1));
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutUsEle).perform();
		Thread.sleep(1000);

		String xpath2 = "(//a[text()='Facts & Figures '])[2]";
		driver.findElement(By.xpath(xpath2)).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		
		String xpath3="(//a[text()='ISTQB® Worldwide '])[2]";
		WebElement worldwideEle=driver.findElement(By.xpath(xpath3));
		actions.moveToElement(worldwideEle).perform();
		

		String xpath4="(//a[text()='Find a Training Provider '])[2]";
		driver.findElement(By.xpath(xpath4)).click();
		Thread.sleep(1000);
		driver.close();

	}

}
