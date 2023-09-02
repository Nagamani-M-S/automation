package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Methods_testng1 {
	@Test
	public void test4()
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.quit();
	}
	}


