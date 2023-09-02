package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Methods_testng {
	@Test(priority=1,invocationCount=3)
	public void test2()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com");
	}
	@Test(enabled=false)
	public void test3()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com");
	}
	}

