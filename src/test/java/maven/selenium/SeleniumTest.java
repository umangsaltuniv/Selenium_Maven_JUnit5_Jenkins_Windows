package maven.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumTest {

	@Test
	void test() {
		String driverPath = System.getProperty("user.dir")
							+ File.separator
							+ "drivers"
							+ File.separator
							+ "chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
		
		driver.quit();
		
		
		
		
	}

}
