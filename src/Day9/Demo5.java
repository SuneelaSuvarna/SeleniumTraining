package Day9;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TV");
		Thread.sleep(1000);
		List<WebElement> tvSuggestion = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		Thread.sleep(1000);

		for (int i = 0; i < tvSuggestion.size(); i++) {

			System.out.println(tvSuggestion.get(i).getAttribute("data-keyword"));

		}

		driver.close();

	}

}
